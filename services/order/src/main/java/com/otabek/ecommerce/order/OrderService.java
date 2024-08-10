package com.otabek.ecommerce.order;

import com.otabek.ecommerce.customer.CustomerClient;
import com.otabek.ecommerce.exception.BusinessException;
import com.otabek.ecommerce.orderline.OrderLineRequest;
import com.otabek.ecommerce.orderline.OrderLineService;
import com.otabek.ecommerce.product.ProductClient;
import com.otabek.ecommerce.product.PurchaseRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;
    private final CustomerClient customerClient;
    private final ProductClient productClient;
    private final OrderMapper mapper;
    private final OrderLineService orderLineService;
    public Long createOrder(OrderRequest request) {
        var customer = customerClient.findCustomerById(request.customerId())
                .orElseThrow(() -> new BusinessException("Cannot create order:: Customer not found with ID: " + request.customerId()));

        productClient.purchaseProducts(request.products());

        var order = repository.save(mapper.toOrder(request));
        for(PurchaseRequest purchaseRequest : request.products()) {
            orderLineService.saveOrderLine(
                    new OrderLineRequest(
                            null,
                            order.getId(),
                            purchaseRequest.productId(),
                            purchaseRequest.quantity()

                    )
            );
        }

        // todo: start payment process
        // todo: send the order confirmation  --> notification service (kafka)


        return null;
    }
}

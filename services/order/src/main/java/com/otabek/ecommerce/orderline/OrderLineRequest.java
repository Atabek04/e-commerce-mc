package com.otabek.ecommerce.orderline;

public record OrderLineRequest(
        Long id,
        Long orderId,
        Long productId,
        Integer quantity
) {
}

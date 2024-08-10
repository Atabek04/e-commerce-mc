package com.otabek.ecommerce.order;

import com.otabek.ecommerce.product.PurchaseRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.List;

public record OrderRequest(
        Long id,
        String reference,
        @Positive(message = "Order amount must be greater than zero")
        BigDecimal amount,
        @NotNull(message = "Payment method is required")
        PaymentMethod paymentMethod,
        @NotNull(message = "Customer is required")
        @NotEmpty(message = "Customer ID is required")
        @NotBlank(message = "Customer ID is required")
        String customerId,
        @NotEmpty(message = "You should provide at least one product")
        List<PurchaseRequest> products
) {
}

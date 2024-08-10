package com.otabek.ecommerce.product;

import jakarta.validation.constraints.NotNull;

public record PurchaseRequest(
        @NotNull(message = "Product ID is required")
        Long productId,
        @NotNull(message = "Quantity is required")
        Integer quantity
) {
}

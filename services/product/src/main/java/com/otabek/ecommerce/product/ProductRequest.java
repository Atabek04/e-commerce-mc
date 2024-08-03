package com.otabek.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductRequest(
        Long id,
        @NotNull(message = "Product name is required")
        String name,
        @NotNull(message = "Product description is required")
        String description,
        @Positive(message = "Product inStock must be positive")
        int inStock,
        @Positive(message = "Product price must be positive")
        BigDecimal price,
        @NotNull(message = "Product category is required")
        Long categoryId
) {

}

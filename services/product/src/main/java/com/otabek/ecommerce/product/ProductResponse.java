package com.otabek.ecommerce.product;

import java.math.BigDecimal;

public record ProductResponse(
        Long id,
        String name,
        String description,
        int inStock,
        BigDecimal price,
        Long categoryId,
        String categoryName,
        String categoryDescription
) {
}

package api.ecommerce.DTO;

import api.ecommerce.Entity.Categories;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductDTO(

        @NotBlank
        String name,


        @Positive
        @NotNull
        @Digits(integer = 10, fraction = 2)
        BigDecimal price,

        @NotBlank
        Categories category,

        @NotBlank
        String sku,

        @NotBlank
        String description) {
}

package br.tcc.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

/**
 * Corpo de requisicao para criacao e atualizacao de produtos (POST / PUT).
 */
public record ProductRequestDTO(

        @NotBlank(message = "O nome do produto e obrigatorio")
        @Size(max = 120, message = "O nome deve ter no maximo 120 caracteres")
        String name,

        @Size(max = 500, message = "A descricao deve ter no maximo 500 caracteres")
        String description,

        @NotNull(message = "O preco e obrigatorio")
        @DecimalMin(value = "0.0", inclusive = true, message = "O preco nao pode ser negativo")
        BigDecimal price,

        @NotNull(message = "A quantidade em estoque e obrigatoria")
        @PositiveOrZero(message = "A quantidade em estoque nao pode ser negativa")
        Integer stockQuantity
) {
}

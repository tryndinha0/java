package br.tcc.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Representacao devolvida pela API para operacoes de consulta e escrita.
 */
public record ProductResponseDTO(
        Long id,
        String name,
        String description,
        BigDecimal price,
        Integer stockQuantity,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}

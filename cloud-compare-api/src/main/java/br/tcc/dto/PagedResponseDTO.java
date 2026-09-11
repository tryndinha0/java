package br.tcc.dto;

import java.util.List;

/**
 * Envelope de paginacao proprio da API.
 */
public record PagedResponseDTO<T>(
        List<T> content,
        int pageNumber,
        int pageSize,
        long totalElements,
        int totalPages,
        boolean first,
        boolean last
) {
}

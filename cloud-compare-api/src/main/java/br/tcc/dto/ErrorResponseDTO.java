package br.tcc.dto;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Formato unico de erro devolvido pela API, independentemente do provedor
 * de nuvem em que a aplicacao esteja rodando.
 */
public record ErrorResponseDTO(
        LocalDateTime timestamp,
        int status,
        String error,
        String message,
        List<String> details
) {
}

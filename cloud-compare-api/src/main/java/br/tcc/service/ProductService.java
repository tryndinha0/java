package br.tcc.service;

import br.tcc.dto.PagedResponseDTO;
import br.tcc.dto.ProductRequestDTO;
import br.tcc.dto.ProductResponseDTO;
import org.springframework.data.domain.Pageable;

public interface ProductService {

    ProductResponseDTO create(ProductRequestDTO dto);

    ProductResponseDTO findById(Long id);

    PagedResponseDTO<ProductResponseDTO> findAll(Pageable pageable);

    ProductResponseDTO update(Long id, ProductRequestDTO dto);

    void delete(Long id);
}

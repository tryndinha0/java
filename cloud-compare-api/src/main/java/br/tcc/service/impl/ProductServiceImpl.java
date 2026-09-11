package br.tcc.service.impl;

import br.tcc.dto.PagedResponseDTO;
import br.tcc.dto.ProductRequestDTO;
import br.tcc.dto.ProductResponseDTO;
import br.tcc.exception.ResourceNotFoundException;
import br.tcc.mapper.ProductMapper;
import br.tcc.model.Product;
import br.tcc.repository.ProductRepository;
import br.tcc.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductResponseDTO create(ProductRequestDTO dto) {
        Product saved = repository.save(ProductMapper.toEntity(dto));
        return ProductMapper.toResponseDTO(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public ProductResponseDTO findById(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Produto nao encontrado com id " + id));
        return ProductMapper.toResponseDTO(product);
    }

    @Override
    @Transactional(readOnly = true)
    public PagedResponseDTO<ProductResponseDTO> findAll(Pageable pageable) {
        Page<Product> page = repository.findAll(pageable);
        return new PagedResponseDTO<>(
                page.getContent().stream().map(ProductMapper::toResponseDTO).toList(),
                page.getNumber(),
                page.getSize(),
                page.getTotalElements(),
                page.getTotalPages(),
                page.isFirst(),
                page.isLast()
        );
    }

    @Override
    public ProductResponseDTO update(Long id, ProductRequestDTO dto) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Produto nao encontrado com id " + id));
        ProductMapper.updateEntity(product, dto);
        return ProductMapper.toResponseDTO(repository.save(product));
    }

    @Override
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Produto nao encontrado com id " + id);
        }
        repository.deleteById(id);
    }
}

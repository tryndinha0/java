package br.tcc.controller;

import br.tcc.dto.PagedResponseDTO;
import br.tcc.dto.ProductRequestDTO;
import br.tcc.dto.ProductResponseDTO;
import br.tcc.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

/**
 * Operacoes CRUD sobre produtos: e o recurso exercitado pelos testes de carga (JMeter) 
 */
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ProductResponseDTO> create(@Valid @RequestBody ProductRequestDTO dto) {
        ProductResponseDTO created = service.create(dto);
        return ResponseEntity.created(URI.create("/api/v1/products/" + created.id())).body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<PagedResponseDTO<ProductResponseDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> update(@PathVariable Long id,
                                                       @Valid @RequestBody ProductRequestDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

package br.tcc.mapper;

import br.tcc.dto.ProductRequestDTO;
import br.tcc.dto.ProductResponseDTO;
import br.tcc.model.Product;

public final class ProductMapper {

    private ProductMapper() {
    }

    public static Product toEntity(ProductRequestDTO dto) {
        Product product = new Product();
        product.setName(dto.name());
        product.setDescription(dto.description());
        product.setPrice(dto.price());
        product.setStockQuantity(dto.stockQuantity());
        return product;
    }

    public static void updateEntity(Product product, ProductRequestDTO dto) {
        product.setName(dto.name());
        product.setDescription(dto.description());
        product.setPrice(dto.price());
        product.setStockQuantity(dto.stockQuantity());
    }

    public static ProductResponseDTO toResponseDTO(Product product) {
        return new ProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getStockQuantity(),
                product.getCreatedAt(),
                product.getUpdatedAt()
        );
    }
}

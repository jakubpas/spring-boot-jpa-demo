package net.jakubpas.demo.mapper;

import net.jakubpas.demo.dto.ProductDTO;
import net.jakubpas.demo.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
	ProductDTO productToProductDto(Product product);
	Product productDtoToProduct(ProductDTO productDTO);
	List<ProductDTO> productsToProductDtos(List<Product> products);
}

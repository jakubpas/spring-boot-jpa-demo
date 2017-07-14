package net.jakubpas.demo.mapper;

import net.jakubpas.demo.dto.ProductDto;
import net.jakubpas.demo.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
	ProductDto productToProductDto(Product product);
	Product productDtoToProduct(ProductDto productDto);
	List<ProductDto> productsToProductDtos(List<Product> products);
}

package net.jakubpas.demo.service;

import net.jakubpas.demo.dto.ProductDTO;
import net.jakubpas.demo.mapper.ProductMapper;
import net.jakubpas.demo.model.Product;
import net.jakubpas.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
    @Autowired
    private ProductMapper productMapper;

	public Integer insert(ProductDTO productDTO) {
		return productRepository.saveAndFlush(productMapper.productDtoToProduct(productDTO)).getId();
	}

	public List<ProductDTO> getAll() {
		return productMapper.productsToProductDtos(productRepository.findAll());
	}

	public void loadProducts() {
		productRepository.save(new Product(1,new Long("1001"), "Product 1", "Product 1 description", new BigDecimal("101.1")));
		productRepository.save(new Product(2,new Long("1002"), "Product 2", "Product 1 description", new BigDecimal("204.5")));
		productRepository.save(new Product(3,new Long("1004"), "Product 3", "Product 1 description", new BigDecimal("305.7")));
	}
}

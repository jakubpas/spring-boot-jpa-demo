package net.jakubpas.demo.service;

import net.jakubpas.demo.dto.ProductDto;
import net.jakubpas.demo.mapper.ProductMapper;
import net.jakubpas.demo.model.Product;
import net.jakubpas.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

	@Inject
	private ProductRepository productRepository;
    @Inject
    private ProductMapper productMapper;

	public Integer insert(ProductDto productDto) {
		return productRepository.saveAndFlush(productMapper.productDtoToProduct(productDto)).getId();
	}

	public List<Product> getAll() {
		return productRepository.findAll();
	}

	public void loadProducts() {
		productRepository.save(new Product(1,new Long("1001"), "Product 1", "Product 1 description", new BigDecimal("101.1")));
		productRepository.save(new Product(2,new Long("1002"), "Product 2", "Product 1 description", new BigDecimal("204.5")));
		productRepository.save(new Product(3,new Long("1004"), "Product 3", "Product 1 description", new BigDecimal("305.7")));
	}
}

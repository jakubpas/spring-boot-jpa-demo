package net.jakubpas.demo.service;

import net.jakubpas.demo.dto.OrderDto;
import net.jakubpas.demo.mapper.OrderMapper;
import net.jakubpas.demo.mapper.ProductMapperImpl;
import net.jakubpas.demo.model.Order;
import net.jakubpas.demo.model.Product;
import net.jakubpas.demo.repository.OrderRepository;
import net.jakubpas.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

	@Inject
	private OrderRepository OrderRepository;
	@Inject
	private ProductRepository productRepository;
    @Inject
    private OrderMapper OrderMapper;

	public Integer insert(OrderDto OrderDto) {

		List<Product> products = new ArrayList<>();

		Product product = productRepository.getOne(OrderDto.getProductId());

		if (product == null) {
			return null;
		}
		products.add(product);

		Order order = OrderMapper.OrderDtoToOrder(OrderDto);
		order.setProducts(products);
		return OrderRepository.save(order).getId();
	}

	public List<Order> getAll() {
		return OrderRepository.findAll();
	}
}

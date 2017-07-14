package net.jakubpas.demo.service;

import net.jakubpas.demo.dto.OrderDto;
import net.jakubpas.demo.mapper.OrderMapper;
import net.jakubpas.demo.model.Order;
import net.jakubpas.demo.repository.OrderRepository;
import org.springframework.stereotype.Service;
import javax.inject.Inject;
import java.util.List;

@Service
public class OrderService {

	@Inject
	private OrderRepository OrderRepository;
    @Inject
    private OrderMapper OrderMapper;

	public Integer insert(OrderDto OrderDto) {

		Order order = OrderMapper.OrderDtoToOrder(OrderDto);
		return OrderRepository.save(order).getId();
	}

	public List<Order> getAll() {
		return OrderRepository.findAll();
	}
}

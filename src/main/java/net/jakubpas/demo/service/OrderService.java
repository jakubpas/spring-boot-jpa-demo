package net.jakubpas.demo.service;

import net.jakubpas.demo.dto.OrderDTO;
import net.jakubpas.demo.dto.OrdersDTO;
import net.jakubpas.demo.mapper.OrdersMapperImpl;
import net.jakubpas.demo.model.Order;
import net.jakubpas.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

	@Autowired
	private OrderRepository OrderRepository;
    @Autowired
    private OrdersMapperImpl OrdersMapperImpl;

	public Integer insert(OrderDTO OrderDTO) {
		Order order = OrdersMapperImpl.orderDTOToOrder(OrderDTO);
		return OrderRepository.save(order).getId();
	}

	public List<OrdersDTO> getAll() {
		return OrdersMapperImpl.ordersToOrderListDTOs(OrderRepository.findAll());
	}
}

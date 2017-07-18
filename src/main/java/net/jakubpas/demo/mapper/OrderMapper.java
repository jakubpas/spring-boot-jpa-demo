package net.jakubpas.demo.mapper;

import net.jakubpas.demo.dto.OrderDTO;
import net.jakubpas.demo.dto.OrdersDTO;
import net.jakubpas.demo.model.Order;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    Order orderDTOToOrder(OrderDTO OrderDTO);
    List<OrdersDTO> ordersToOrderListDTOs(List<Order> order);
}

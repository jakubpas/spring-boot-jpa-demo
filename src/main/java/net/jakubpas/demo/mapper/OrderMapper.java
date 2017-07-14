package net.jakubpas.demo.mapper;

import net.jakubpas.demo.dto.OrderDto;
import net.jakubpas.demo.model.Account;
import net.jakubpas.demo.model.Order;
import net.jakubpas.demo.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class OrderMapper {
//	OrderDto OrderToOrderDto(Order Order);
//	Order OrderDtoToOrder(OrderDto OrderDto);
	abstract List<OrderDto> OrdersToOrderDtos(List<Order> Orders);

    public Order OrderDtoToOrder(OrderDto OrderDto) {

        Order order = new Order();
        Account account = new Account();
        account.setName(OrderDto.getCompanyName());
        account.setAddress(OrderDto.getAddress());
        account.setEmail(OrderDto.getEmail());
        account.setPhone(OrderDto.getPhone());
        account.setCountry(OrderDto.getCountry());
        account.setCity(OrderDto.getCity());
        account.setZip(OrderDto.getZip());
        order.setAccount(account);
        return order;
    }
}

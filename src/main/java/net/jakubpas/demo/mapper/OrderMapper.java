package net.jakubpas.demo.mapper;

import net.jakubpas.demo.dto.OrderDto;
import net.jakubpas.demo.model.Account;
import net.jakubpas.demo.model.Order;
import net.jakubpas.demo.model.Product;
import net.jakubpas.demo.repository.ProductRepository;
import org.mapstruct.Mapper;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Mapper(componentModel = "spring")
public abstract class OrderMapper {

    @Inject
    private ProductRepository productRepository;

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

        List<Product> products = new ArrayList<>();

        OrderDto.getProducts().forEach((productDto ->
                IntStream.range(0, productDto.getQuantity()).forEach(i ->
                        products.add(productRepository.getOne(productDto.getProductId())))));

        order.setProducts(products);
        return order;
    }
}

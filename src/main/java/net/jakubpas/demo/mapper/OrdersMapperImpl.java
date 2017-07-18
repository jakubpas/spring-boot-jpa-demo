package net.jakubpas.demo.mapper;

import net.jakubpas.demo.dto.OrderDTO;
import net.jakubpas.demo.dto.ProductDTO;
import net.jakubpas.demo.dto.ProductsDTO;
import net.jakubpas.demo.model.Account;
import net.jakubpas.demo.model.Order;
import net.jakubpas.demo.model.Product;
import net.jakubpas.demo.repository.ProductRepository;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

@Mapper(componentModel = "spring")
public abstract class OrdersMapperImpl implements OrderMapper {

    @Autowired
    private ProductRepository productRepository;

    public Order orderDTOToOrder(OrderDTO OrderDTO) {

        Order order = new Order();
        Account account = new Account();
        account.setCompanyName(OrderDTO.getCompanyName());
        account.setAddress(OrderDTO.getAddress());
        account.setEmail(OrderDTO.getEmail());
        account.setPhone(OrderDTO.getPhone());
        account.setCountry(OrderDTO.getCountry());
        account.setCity(OrderDTO.getCity());
        account.setZip(OrderDTO.getZip());
        order.setAccount(account);
        order.setCreateDate(ZonedDateTime.now());

        List<Product> products = new ArrayList<>();
        for (ProductsDTO productsDTO: OrderDTO.getProducts()) {
            Product product = productRepository.getOne(productsDTO.getProductId());
            for (int i = 0; i < productsDTO.getQuantity(); i++) {
                products.add(product);
            }
        }

        order.setTotalPrice(products.stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add));

        order.setProducts(products);
        return order;
    }
}

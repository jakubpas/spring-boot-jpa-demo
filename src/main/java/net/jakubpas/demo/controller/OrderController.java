package net.jakubpas.demo.controller;

import io.swagger.annotations.ApiOperation;
import net.jakubpas.demo.dto.OrderDto;
import net.jakubpas.demo.model.Order;
import net.jakubpas.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")

public class OrderController {

    @Autowired
    OrderService OrderService;

    @ApiOperation("List Orders")
    @GetMapping
    public List<Order> list() {
        return OrderService.getAll();
    }

    @ApiOperation(value = "Add OrderDto")
    @PostMapping
    public ResponseEntity<Integer> save(@RequestBody OrderDto OrderDto) {
        Integer id = OrderService.insert(OrderDto);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }
}

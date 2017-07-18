package net.jakubpas.demo.controller;

import io.swagger.annotations.ApiOperation;
import net.jakubpas.demo.dto.OrderDTO;
import net.jakubpas.demo.dto.OrdersDTO;
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
    public List<OrdersDTO> list() {
        return OrderService.getAll();
    }

    @ApiOperation(value = "Add Order")
    @PostMapping
    public ResponseEntity<Integer> save(@RequestBody OrderDTO OrderDTO) {
        Integer id = OrderService.insert(OrderDTO);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }
}

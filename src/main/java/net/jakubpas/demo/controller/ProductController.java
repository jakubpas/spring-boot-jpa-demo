package net.jakubpas.demo.controller;

import net.jakubpas.demo.dto.ProductDto;
import net.jakubpas.demo.model.Product;
import net.jakubpas.demo.service.ProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {

    @Autowired
    ProductService productService;

    @ApiOperation("List Products")
    @GetMapping
    public List<Product> list() {
        return productService.getAll();
    }

    @ApiOperation(value = "Add ProductDto")
    @PostMapping
    public ResponseEntity<Integer> save(@RequestBody ProductDto productDto) {
        Integer id = productService.insert(productDto);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }
}

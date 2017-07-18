package net.jakubpas.demo.controller;

import net.jakubpas.demo.dto.ProductDTO;
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
    public List<ProductDTO> list() {
        return productService.getAll();
    }

    @ApiOperation(value = "Add Product")
    @PostMapping
    public ResponseEntity<Integer> save(@RequestBody ProductDTO productDTO) {
        Integer id = productService.insert(productDTO);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }
}

package com.sanstrick.productservice.controller;

import com.sanstrick.productservice.model.Product;
import com.sanstrick.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String add(@RequestBody Product product){
        productService.saveProduct(product);
        return "New product is added";
    }

    @GetMapping("/getAll")
    public List<Product> list(){
        return productService.getAllProducts();
    }
}

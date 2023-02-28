package com.insper.store.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService = new ProductService();

    @GetMapping
    public List<Product> listProducts() {
        return productService.listsProducts();
    }
}

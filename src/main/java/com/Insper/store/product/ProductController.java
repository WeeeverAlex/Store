package com.insper.store.product;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService = new ProductService();

    @GetMapping
    public List<Product> listProducts() {
        return productService.getProducts();
    }

    @PostMapping
    public Product saveProduct(@RequestBody @Valid Product product) {
        return productService.saveProduct(product);
    }
}

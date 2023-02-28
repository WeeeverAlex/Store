package com.insper.store.product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public List<Product> listsProducts() {
        return products;
    }

    public Product saveProduct(Product product) {
        product.setId(UUID.randomUUID().toString());
        products.add(product);
        return product;
    }

}

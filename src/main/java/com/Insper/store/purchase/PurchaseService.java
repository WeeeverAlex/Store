package com.insper.store.purchase;

import com.insper.store.product.Product;
import com.insper.store.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PurchaseService {

    private List<Purchase> purchases = new ArrayList<>();

    @Autowired
    private ProductService productService;

    public List<Purchase> getPurchase() {
        return purchases;
    }

    public Purchase savePurchase(Purchase purchase) {

        for (Item item : purchase.getItems()) {
            Product product = productService
                    .findProduct(item.getProduct().getId());
            if (product == null) {
                return null;
            }
        }
        purchase.setId(UUID.randomUUID().toString());
        purchases.add(purchase);
        return purchase;
    }

}

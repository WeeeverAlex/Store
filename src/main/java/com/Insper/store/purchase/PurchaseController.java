package com.insper.store.purchase;

import com.insper.store.product.Product;
import com.insper.store.product.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    private PurchaseService purchaseService = new PurchaseService();

    @GetMapping
    public List<Purchase> listPurchases() {return purchaseService.getPurchase(); }

    @PostMapping
    public Purchase savePurchase(@RequestBody @Valid Purchase purchase) {
        return purchaseService.savePurchase(purchase);
    }
}

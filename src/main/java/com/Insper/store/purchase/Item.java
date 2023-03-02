package com.insper.store.purchase;

import com.insper.store.product.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    private Product product;
    private Float price;

}

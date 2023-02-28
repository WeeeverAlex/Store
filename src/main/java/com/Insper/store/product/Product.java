package com.insper.store.product;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Product {

    private String id;
    @NonNull
    private String name;
    @NonNull
    private Integer stock;
    @NonNull
    private Float price;

}

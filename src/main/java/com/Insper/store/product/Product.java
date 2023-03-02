package com.insper.store.product;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Product {

    private String id;
    @NonNull
    @NotNull
    @NotEmpty
    private String name;
    @NonNull
    private Integer stock;
    @NonNull
    private Float price;

}

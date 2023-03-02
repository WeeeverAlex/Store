package com.insper.store.purchase;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Purchase {

    private String id;
    private LocalDateTime dataPurchase;
    private List<Item> items = new ArrayList<>();

}

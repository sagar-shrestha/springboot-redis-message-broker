package com.example.springbootredismessagebroker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private Integer id;
    private String name;
    private Integer qty;
    private long price;
}

package com.Practise1.demo5.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductUploadDTO {
    private String productName;
    private String description;
    private Integer cost;
}

package br.com.mv.cloud.aws.dto;


import br.com.mv.cloud.aws.enums.ColorEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEventDTO {

    private Long id;
    private String username;
    private String name;
    private String model;
    private String code;
    private BigDecimal price;
    private ColorEnum color;
}

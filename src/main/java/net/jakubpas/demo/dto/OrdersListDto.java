package net.jakubpas.demo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdersListDto {

    @ApiModelProperty(value = "Salesforce product Id")
    private Long salesforceId;

    @ApiModelProperty(value = "Product name")
    private String name;

    @ApiModelProperty(value = "Product description")
    private String description;

    @ApiModelProperty(value = "Product price")
    private BigDecimal price;
}

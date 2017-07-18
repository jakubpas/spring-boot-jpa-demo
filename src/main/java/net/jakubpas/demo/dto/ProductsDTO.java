package net.jakubpas.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Purchased products DTO", description = "Purchased products DTO")
public class ProductsDTO {

    @ApiModelProperty(value = "Product Id")
    private Integer productId;

    @ApiModelProperty(value = "Product name")
    private Integer quantity;
}

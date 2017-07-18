package net.jakubpas.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Product DTO", description = "Product DTO")
public class ProductDTO {
    @ApiModelProperty(value = "SalesForce product Id", example = "10001")
    private Long salesforceId;

    @ApiModelProperty(value = "Product name", example = "Product 1")
    private String name;

    @ApiModelProperty(value = "Product description", example = "Product 1 description")
    private String description;

    @ApiModelProperty(value = "Product price", example = "104.55")
    private BigDecimal price;
}

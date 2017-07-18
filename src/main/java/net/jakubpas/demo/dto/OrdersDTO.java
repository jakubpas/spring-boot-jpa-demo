package net.jakubpas.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Order list DTO", description = "Order list DTO")
public class OrdersDTO {
    @ApiModelProperty(value = "Purchased products")
    private List<ProductDTO> products;
    @ApiModelProperty(value = "AccountDTO data")
    private AccountDTO account;
    @ApiModelProperty(value = "Total price", example = "615.33")
    private BigDecimal totalPrice;
    @ApiModelProperty(value = "Order date", example = "1500413998000")
    private java.util.Date createDate;
}

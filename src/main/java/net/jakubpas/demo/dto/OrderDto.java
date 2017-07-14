package net.jakubpas.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Order DTO", description = "Placed order DTO")
public class OrderDto {
    @ApiModelProperty(value = "Existing product Ids and quantity")
    private List<PurchasedProductsDto> products;
    @ApiModelProperty(value = "Company name", example = "IBM")
    private String companyName;
    @ApiModelProperty(value = "Email address", example = "IBM")
    private String email;
    @ApiModelProperty(value = "Telephone number", example = "testEmail@test.pl")
    private String phone;
    @ApiModelProperty(value = "Company name", example = "+49600503403")
    private String address;
    @ApiModelProperty(value = "Country", example = "Poland")
    private String country;
    @ApiModelProperty(value = "Zip code", example = "428426")
    private String zip;
    @ApiModelProperty(value = "City name", example = "Poznan")
    private String city;
}

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
@ApiModel(value = "Model", description = "Model description")
public class OrderDto {

    @ApiModelProperty(value = "Existing product Id")
    private Integer productId;
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

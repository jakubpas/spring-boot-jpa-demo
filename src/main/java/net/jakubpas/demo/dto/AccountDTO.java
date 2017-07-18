package net.jakubpas.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Account DTO", description = "Account DTO")
public class AccountDTO {
    @ApiModelProperty(value = "Company name", example = "IBM")
    private String companyName;
    @ApiModelProperty(value = "Email address", example = "testEmail@test.pl")
    private String email;
    @ApiModelProperty(value = "Telephone number", example = "+48700898904")
    private String phone;
    @ApiModelProperty(value = "Address", example = "Sesame street 5")
    private String address;
    @ApiModelProperty(value = "Country", example = "Poland")
    private String country;
    @ApiModelProperty(value = "Zip code", example = "428426")
    private String zip;
    @ApiModelProperty(value = "City name", example = "Poznań")
    private String city;
}
package com.marketsharks.supplier_search_api.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MyRequest {

    @NotBlank(message = "Location cannot be blank")
    private String location;

    @NotBlank(message = "Nature of business cannot be blank")
    private String nature_of_business;

    @NotBlank(message = "Manufacturing processes cannot be blank")
    private String manufacturing_processes;
}
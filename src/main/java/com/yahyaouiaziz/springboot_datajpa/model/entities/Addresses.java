package com.yahyaouiaziz.springboot_datajpa.model.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Addresses {

    private String city;
    private String street;
    private Integer zipCode;
}

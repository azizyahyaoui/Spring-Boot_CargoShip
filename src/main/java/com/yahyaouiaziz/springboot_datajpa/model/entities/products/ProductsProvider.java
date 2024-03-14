package com.yahyaouiaziz.springboot_datajpa.model.entities.products;

import com.yahyaouiaziz.springboot_datajpa.model.entities.Addresses;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
@Entity
@Table(name = "tbl_products_Providers")
@AttributeOverrides({
        @AttributeOverride(
                name = "providerId",
                column = @Column(name = "provider_id")
        ),
        @AttributeOverride(
                name = "providerName",
                column = @Column(name = "provider_name")
        ),
        @AttributeOverride(
                name = "providerEmail",
                column = @Column(name = "provider_email")
        ),
        @AttributeOverride(
                name = "providerPhoneNumber",
                column = @Column(name = "provider_phone_number")
        )
})
public class ProductsProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long providerId;
    private String providerName;
    private String providerEmail;
    private Integer providerPhoneNumber;

    @Embedded
    private Addresses providerAddresses;

    @OneToMany(mappedBy = "ProductsProvider", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Products> productsList ;
}

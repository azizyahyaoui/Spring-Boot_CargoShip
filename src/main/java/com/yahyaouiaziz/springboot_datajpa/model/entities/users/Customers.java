package com.yahyaouiaziz.springboot_datajpa.model.entities.users;

import com.yahyaouiaziz.springboot_datajpa.model.entities.Addresses;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_customers")
@AttributeOverrides({
        @AttributeOverride(
                name = "customerId",
                column = @Column(name = "customer_id")
        ),
        @AttributeOverride(
                name = "firstName",
                column = @Column(name = "first_name")
        ),
        @AttributeOverride(
                name = "lastName",
                column = @Column(name = "last_name")
        ),
        @AttributeOverride(
                name = "dataOfBirth",
                column = @Column(name = "data_of_birth")
        )
})
public class Customers {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String firstName;
    private String lastName;
    private String email;
    private Date dataOfBirth;
    @Embedded
    private Addresses addresses;

}

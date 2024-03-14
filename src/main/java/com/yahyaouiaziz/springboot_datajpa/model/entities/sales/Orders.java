package com.yahyaouiaziz.springboot_datajpa.model.entities.sales;

import com.yahyaouiaziz.springboot_datajpa.model.entities.sales.enums.OrderStatus;
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
@Table(name = "tbl_order")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "order_id"
    )
    private Long orderId;

    @Column(name = "order_date")
    private Date orderDate;
    @Column(name = "required_date")
    private Date requiredDate;
    @Column(name = "shipped_date")
    private Date shippedDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "order_status")
    private OrderStatus orderStatus;
    @Column(name = "invoice")
    private String  orderInvoice ="You'll receive the Invoice later";
    private Long customer_id;
    private Long store_id;
    private Long StoreWorker_id;

}

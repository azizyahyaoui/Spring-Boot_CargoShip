package com.yahyaouiaziz.springboot_datajpa.model.entities.users.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum WorkerStatus {
    ACTIVE("Active"),
    ON_LEAVE("On Leave"),
    INACTIVE("Inactive"),
    TERMINATED("Terminated");

    private final String status;

}

package com.yahyaouiaziz.springboot_datajpa.model.entities.users.workers;

import com.yahyaouiaziz.springboot_datajpa.model.entities.users.enums.WorkerStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Workers {
    private Long workerId;

    private String workerName;

    @Enumerated(EnumType.STRING)
    private WorkerStatus workerStatus;
}

package com.propertyservice.propertyservice.dto.property;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PropertyForm {
    private Long propertyId;
    @NotNull
    private Long buildingId;
    @NotNull @NotBlank
    private String unitNumber;
    private Long picManagerId;
    private Long propertyTypeId;
    @NotNull
    private Long transactionTypeId;
    private BigDecimal deposit;
    private BigDecimal monthlyFee;
    private BigDecimal jeonseFee;
    private BigDecimal tradeFee;
    @NotNull
    private BigDecimal maintenanceFee;
    @NotNull
    private boolean maintenanceItemWater;
    @NotNull
    private boolean maintenanceItemElectricity;
    @NotNull
    private boolean maintenanceItemInternet;
    @NotNull
    private boolean maintenanceItemGas;
    private String maintenanceItemOthers;
    private Long transactionStateId;
    private String remark;
}

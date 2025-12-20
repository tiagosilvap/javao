package com.project.utils.zip.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlexPayPaymentEntitlementPolicy {

    private String condition;
    private Integer threshold;
    private List<String> matchChargeStatus;
    private String action;
    private Integer alertAfterDays;
}

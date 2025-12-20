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
public class FlexPaySelectedPlan {

    private String planId;
    private List<PaymentPlanStep> paymentPlanSteps;
    private FlexPayPaymentEntitlementPolicy flexPayPaymentEntitlementPolicy;
}

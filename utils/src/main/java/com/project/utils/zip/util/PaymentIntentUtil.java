package com.project.utils.zip.util;

import com.project.utils.zip.vo.*;

import java.math.BigDecimal;
import java.util.Arrays;

public final class PaymentIntentUtil {
    private PaymentIntentUtil() {
    }

    public static PaymentIntent buildFlexPayPaymentIntent() {

        Interval interval = Interval.builder()
                .type("MONTH")
                .every(1)
                .limit(12)
                .build();

        TrialSettings trialSettings = TrialSettings.builder()
                .period(7)
                .periodType("DAY")
                .chargeMode("AFTER_TRIAL")
                .build();


        PaymentPlanStep paymentPlanStep = PaymentPlanStep.builder()
                .stepId("e4f5a6b7-8c9d-4e1f-a2b3-c4d5e6f7a8b9")
                .order(1)
                .type("RECURRENT")
                .description("Cobrança mensal do plano")
                .interval(interval)
                .value(new BigDecimal("99.90"))
                .currency("BRL")
                .dueDay(10)
                .paymentMethod("CREDIT_CARD")
                .installments(1)
                .releasedContent(Arrays.asList("c9d8e7f6-a5b4-4c3d-9e2f-1a0b9c8d7e6f"))
                .trialSettings(trialSettings)
                .build();

        FlexPayPaymentEntitlementPolicy flexPayPaymentEntitlementPolicy = FlexPayPaymentEntitlementPolicy.builder()
                .condition("LAST_N_CHARGES")
                .threshold(2)
                .matchChargeStatus(Arrays.asList("FAILED"))
                .action("SUSPEND")
                .alertAfterDays(3)
                .build();

        FlexPaySelectedPlan flexPaySelectedPlan = FlexPaySelectedPlan.builder()
                .planId("b1a2c3d4-e5f6-47a8-9b0c-d1e2f3a4b5c6")
                .paymentPlanSteps(Arrays.asList(paymentPlanStep))
                .flexPayPaymentEntitlementPolicy(flexPayPaymentEntitlementPolicy)
                .build();

        FlexPayPaymentPlanRequest flexPayPaymentPlanRequest = FlexPayPaymentPlanRequest.builder()
                .flexPayId("7c2b8e9f-3c4a-4a5e-9c7d-1e2f3a4b5c6d")
                .version(1)
                .flexPaySelectedPlan(flexPaySelectedPlan)
                .build();

        PaymentIntent paymentIntent = PaymentIntent.builder()
                .checkoutKey("a3f1d9a4-6e7a-4d5c-9b0e-8f2c6c9a1b21")
                .type("FLEX_PAY")
                .version(1)
                .flexPayPaymentPlanRequest(flexPayPaymentPlanRequest)
                .build();

        return paymentIntent;
    }
}

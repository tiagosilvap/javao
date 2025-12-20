package com.project.utils.zip.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentIntent {

    private String checkoutKey;
    private String type;
    private Integer version;
    private FlexPayPaymentPlanRequest flexPayPaymentPlanRequest;
}

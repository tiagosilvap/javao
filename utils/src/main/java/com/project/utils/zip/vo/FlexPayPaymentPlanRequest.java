package com.project.utils.zip.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlexPayPaymentPlanRequest {

    private String flexPayId;
    private Integer version;
    private FlexPaySelectedPlan flexPaySelectedPlan;
}

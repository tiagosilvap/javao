package com.project.utils.zip.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPlanStep {

    private String stepId;
    private Integer order;
    private String type;
    private String description;
    private Interval interval;
    private BigDecimal value;
    private String currency;
    private Integer dueDay;
    private String paymentMethod;
    private Integer installments;
    private List<String> releasedContent;
    private TrialSettings trialSettings;
}

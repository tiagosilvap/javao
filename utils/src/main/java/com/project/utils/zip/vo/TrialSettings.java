package com.project.utils.zip.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TrialSettings {
    private Integer period;
    private String periodType;
    private String chargeMode;
}

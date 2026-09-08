package com.gamebasic.runcard.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RunCardRequest {
    @NotBlank
    private String cardType;

    @NotNull
    private Integer acquiredFloor;
}

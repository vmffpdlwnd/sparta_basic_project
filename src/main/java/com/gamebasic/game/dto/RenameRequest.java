package com.gamebasic.game.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RenameRequest {

    @NotBlank
    private String playerName;
}

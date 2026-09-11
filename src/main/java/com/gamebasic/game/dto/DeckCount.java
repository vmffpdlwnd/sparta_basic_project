package com.gamebasic.game.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DeckCount {
    private Long gameId;
    private Long deckSize;
}

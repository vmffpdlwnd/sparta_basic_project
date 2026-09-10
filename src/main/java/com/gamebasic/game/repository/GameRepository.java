package com.gamebasic.game.repository;

import com.gamebasic.game.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    // Lv 7 내릴차순 정력 목록 조회
    List<Game> findAllByOrderByIdDesc();
}

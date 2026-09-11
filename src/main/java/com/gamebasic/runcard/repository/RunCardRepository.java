package com.gamebasic.runcard.repository;

import com.gamebasic.game.dto.DeckCount;
import com.gamebasic.game.entity.Game;
import com.gamebasic.runcard.entity.RunCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RunCardRepository extends JpaRepository<RunCard, Long> {
    List<RunCard> findAllByGameOrderByIdAsc(Game game);

    void deleteAllByGame(Game game);

    // Lv 11 N+1 방지: countByGames로 한번에 집계해서 Map으로 매칭(GameService\getGames)
    @Query (" select new com.gamebasic.game.dto.DeckCount(rc.game.id, count(rc)) " +
            " from RunCard rc where rc.game in :games group by rc.game.id ")
    List<DeckCount> countByGames(@Param("games") List<Game> games);
}

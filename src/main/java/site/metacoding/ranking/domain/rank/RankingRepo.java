package site.metacoding.ranking.domain.rank;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RankingRepo extends JpaRepository<Ranking, Integer> {
    @Query(value = "SELECT * FROM Ranking ORDER BY score DESC ;", nativeQuery = true)
    List<Ranking> findAllRanking();

    // @Query(value = "SELECT * FROM Ranking WHERE rank", nativeQuery = true)
    // List<Ranking> rankChange(@Param("rank")Integer rank);
}

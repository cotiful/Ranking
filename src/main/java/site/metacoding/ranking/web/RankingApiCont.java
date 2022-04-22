package site.metacoding.ranking.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import site.metacoding.ranking.domain.rank.Ranking;
import site.metacoding.ranking.service.RankingService;
import site.metacoding.ranking.web.dto.ResponseDto;

@RequiredArgsConstructor
@RestController
public class RankingApiCont {

    private final RankingService rankingService;

    @GetMapping("/api/rank")
    public ResponseDto<?> rankChange(Ranking ranking) {
        List<Ranking> listRank = rankingService.랭킹가져오기();
        return new ResponseDto<>(1, "성공", listRank);
    }

}

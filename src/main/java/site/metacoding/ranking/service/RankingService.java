package site.metacoding.ranking.service;

import java.util.Comparator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javassist.runtime.Desc;
import lombok.RequiredArgsConstructor;
import site.metacoding.ranking.domain.rank.Ranking;
import site.metacoding.ranking.domain.rank.RankingRepo;

@RequiredArgsConstructor
@Service
public class RankingService {

    private final RankingRepo rankingRepo;

    @Transactional
    public List<Ranking> 랭킹가져오기() {
        List<Ranking> rankingEntity = rankingRepo.findAllRanking();
        System.out.println("rankingEntity:" + rankingEntity);
        return rankingEntity;
    }

    // public List<Ranking> 랭킹업데이트(){
    // List<Ranking> rankingUpdate = rankingRepo.findAllRanking();
    // for(int i=1; rankingUpdate.size(); i++ ){}
    // }

    // @Transactional
    // public void 랭킹변경하기(Integer rank){
    // rankingRepo.rankChange(rank);
    // }

}

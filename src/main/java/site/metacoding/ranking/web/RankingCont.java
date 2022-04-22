package site.metacoding.ranking.web;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.ranking.service.RankingService;

@RequiredArgsConstructor
@Controller
public class RankingCont {

    private final RankingService rankingService;

    @CrossOrigin
    @GetMapping("/rank")
    public String rankingform(Model model) {
        // List<Ranking> listRank = rankingService.랭킹가져오기();
        // model.addAttribute("principal", listRank);
        // System.out.println("어떻게 빠져나오는지 한번 봐보자:" + listRank);

        return "rankingForm";
    }
}

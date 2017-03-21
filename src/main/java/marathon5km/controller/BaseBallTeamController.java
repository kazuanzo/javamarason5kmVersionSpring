package marathon5km.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import marathon5km.domain.BaseballTeam;
import marathon5km.service.BaseballTeamService;

@Controller
public class BaseBallTeamController {
	
	@Autowired
	BaseballTeamService baseballTeamService;
	
	/**
	 * ベースボールチームリストを呼び出し、Modelに登録
	 * baseballTeamList.htmlに値を送る
	 * @param model
	 * @return
	 */
	@RequestMapping("/baseballTeamList")
	String baseballTeam(Model model){
		System.out.println("test");
		List<BaseballTeam> teams=baseballTeamService.index();
		model.addAttribute("teams",teams);
		return "baseballTeamList";
	}
	/**
	 * baseballTeamList.htmlからidを受け取り、サービスクラスでベースボールチームを呼び出す
	 * ベースボールチームをModelに登録
	 * baseballTeamDetail.htmlに値を送る
	 * @param model
	 * @return
	 */
	@RequestMapping("/baseballteam")
	String baseballTeamDetail(Integer id,Model model){
		BaseballTeam team=baseballTeamService.detail(id);
		model.addAttribute("team",team);
		return "baseballTeamDetail";
	}

}

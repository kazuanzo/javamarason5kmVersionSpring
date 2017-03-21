package marathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import marathon.domain.BaseballTeam;
import marathon.service.BaseballTeamService;

@Controller
public class BaseBallTeamController {
	
	@Autowired
	BaseballTeamService baseballTeamService;
		
	@RequestMapping("/baseball")
	String baseballTeam(Model model){
		List<BaseballTeam> teams=baseballTeamService.index();
		model.addAttribute("teams",teams);
		return "baseballTeam";
	}
	
	
	@RequestMapping("/baseballteam")
	String baseballTeamDetail(Integer id,Model model){
		BaseballTeam team=baseballTeamService.detail(id);
		model.addAttribute("team",team);
		return "baseballTeamDetail";
	}

}

package marathon5km.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import marathon5km.domain.BaseballTeam;
import marathon5km.repository.BaseballTeamRepository;



@Service
public class BaseballTeamService {
	@Autowired
	BaseballTeamRepository repository;

	// 球団一覧を表示するメソッド
	public List<BaseballTeam> index() {
		List<BaseballTeam> teamList = repository.findAll();
		return teamList;
	}

	// 球団情報詳細を表示するメソッド
	public BaseballTeam detail(Integer id) {
		return repository.findOne(id);
	}

}

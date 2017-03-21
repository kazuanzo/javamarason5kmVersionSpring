package marathon5km.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity//クラスがエンティティであることを指定
@Table(name="baseball_teams")//テーブル定義
public class BaseballTeam  {
	
	@Id//プライマリキーとなるプロパティかフィールドを指定
	@Column(name="id")
	private int id;

	@Column(name="league_name")
	private String leagueName;
	
	@Column(name="team_name")
	private String teamName;
	
	@Column(name="headquarters")
	private String headquarters;
	
	@Column(name="inauguration")
	private String inauguration;
	
	@Column(name="history")
	private String history;
	
}

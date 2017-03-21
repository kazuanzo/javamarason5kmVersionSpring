package marathon.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import marathon.domain.BaseballTeam;

@Repository
public interface BaseballTeamRepository extends JpaRepository<BaseballTeam,Integer> {
}

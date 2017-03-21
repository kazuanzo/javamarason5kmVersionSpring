package marathon5km.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import marathon5km.domain.BaseballTeam;

@Repository
public interface BaseballTeamRepository extends JpaRepository<BaseballTeam,Integer> {
}

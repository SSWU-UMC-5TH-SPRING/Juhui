package umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.Mission;
import umc.spring.domain.User;
import umc.spring.domain.UserMission;

public interface UserMissionRepository extends JpaRepository<UserMission, Long> {
    UserMission findByMissionAndUser(Mission missionIdx, User userIdx);
}

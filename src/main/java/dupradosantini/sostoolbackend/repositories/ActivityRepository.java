package dupradosantini.sostoolbackend.repositories;

import dupradosantini.sostoolbackend.domain.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
}

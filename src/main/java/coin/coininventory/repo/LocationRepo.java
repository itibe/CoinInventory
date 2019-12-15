package coin.coininventory.repo;

import coin.coininventory.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends JpaRepository<Location, Long> {
}

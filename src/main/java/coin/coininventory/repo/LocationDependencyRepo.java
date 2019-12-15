package coin.coininventory.repo;

import coin.coininventory.entity.LocationDependency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationDependencyRepo extends JpaRepository<LocationDependency, Long> {
}

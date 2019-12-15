package coin.coininventory.repo;

import coin.coininventory.entity.SubLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubLocationRepo extends JpaRepository<SubLocation, Long> {
}

package coin.coininventory.repo;

import coin.coininventory.entity.CoinLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinLocationRepo extends JpaRepository<CoinLocation, Long> {
}

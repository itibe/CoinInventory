package coin.coininventory.repo;

import coin.coininventory.entity.CoinType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinTypeRepo extends JpaRepository<CoinType, Long> {
}

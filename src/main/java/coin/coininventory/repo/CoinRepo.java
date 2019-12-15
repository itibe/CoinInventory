package coin.coininventory.repo;


import coin.coininventory.entity.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinRepo extends JpaRepository<Coin, Long> {
}

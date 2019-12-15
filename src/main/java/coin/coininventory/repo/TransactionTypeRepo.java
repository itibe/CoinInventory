package coin.coininventory.repo;

import coin.coininventory.entity.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionTypeRepo extends JpaRepository<TransactionType, Long> {
}

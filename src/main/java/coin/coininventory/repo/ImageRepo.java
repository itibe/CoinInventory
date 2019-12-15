package coin.coininventory.repo;

import coin.coininventory.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepo extends JpaRepository<Image, Long> {
}

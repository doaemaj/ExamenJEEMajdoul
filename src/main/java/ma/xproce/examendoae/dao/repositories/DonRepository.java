package ma.xproce.examendoae.dao.repositories;

import ma.xproce.examendoae.dao.entities.Don;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DonRepository extends JpaRepository<Don, Integer> {
}

package ma.xproce.examendoae.dao.repositories;

import ma.xproce.examendoae.dao.entities.Donateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonateurRepository extends JpaRepository<Donateur, Integer> {
}

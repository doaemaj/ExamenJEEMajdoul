package ma.xproce.examendoae.dao.repositories;

import ma.xproce.examendoae.dao.entities.Organisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrganisateurRepository extends JpaRepository<Organisateur, Integer> {
}

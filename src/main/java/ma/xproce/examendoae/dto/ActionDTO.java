package ma.xproce.examendoae.dto;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.xproce.examendoae.dao.entities.Action;
import ma.xproce.examendoae.dao.entities.Don;
import ma.xproce.examendoae.dao.entities.Organisateur;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActionDTO {
    private Integer id;
    private String titre;
    private String description;
    private double montant;
    private Action.ActionEtat etat;

    private OrganisateurDTO organisateur;
    private List<DonDTO> dons;
}

package ma.xproce.examendoae.dto;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.xproce.examendoae.dao.entities.Action;
import ma.xproce.examendoae.dao.entities.Don;
import ma.xproce.examendoae.dao.entities.Donateur;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonDTO {
    private Integer id;
    private String titre;
    private double montant;
    private Don.DonType type;

    private ActionDTO action;

}

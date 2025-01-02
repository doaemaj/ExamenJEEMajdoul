package ma.xproce.examendoae.dto;

import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.xproce.examendoae.dao.entities.Don;
import ma.xproce.examendoae.dao.entities.Donateur;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonateurDTO {
    private Integer id;
    private String nom;
    private String prenom;
    private String email;

    private Donateur.DonateurEval evaluation;

    private List<DonDTO> dons;
}

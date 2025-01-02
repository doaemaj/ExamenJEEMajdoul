package ma.xproce.examendoae.dto;

import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.xproce.examendoae.dao.entities.Action;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganisateurDTO {
    private Integer id;
    private String nom;
    private String email;
    private List<ActionDTO> actions;
}

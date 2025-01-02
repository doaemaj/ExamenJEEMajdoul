package ma.xproce.examendoae.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Donateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String motdepasse;

    private DonateurEval evaluation;

    public enum DonateurEval {
        DEBUTANT,
        DONATEUR_ACTIF,
        DONATEUR_FIDELE
    }

    @OneToMany(mappedBy = "donateur",fetch = FetchType.EAGER)
    private List<Don> dons;

}

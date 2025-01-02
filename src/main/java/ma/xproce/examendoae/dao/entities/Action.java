package ma.xproce.examendoae.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titre;
    private String description;
    private LocalDate dateCreation;
    private double montant;
    private ActionEtat etat;

    public enum ActionEtat {
        PREPARATION,
        OUVERTE,
        SUSPENDUE,
        TERMINEE

    }

    @ManyToOne
    private Organisateur organisateur;

    @OneToMany(mappedBy = "action",fetch = FetchType.EAGER)
    private List<Don> dons;
}

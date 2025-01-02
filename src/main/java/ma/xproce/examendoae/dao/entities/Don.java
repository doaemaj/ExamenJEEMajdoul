package ma.xproce.examendoae.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Don {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titre;
    private double montant;
    private DonType type;

    public enum DonType {
        ARGENT,
        BIEN
    }

    @ManyToOne
    private Action action;

    @ManyToOne
    private Donateur donateur;

}

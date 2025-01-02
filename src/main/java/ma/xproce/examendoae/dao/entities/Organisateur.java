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
public class Organisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String email;
    private String motdepasse;

    @OneToMany(mappedBy = "organisateur",fetch = FetchType.EAGER)
    private List<Action> actions;
}

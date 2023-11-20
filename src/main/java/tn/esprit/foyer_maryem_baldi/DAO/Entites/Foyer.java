package tn.esprit.foyer_maryem_baldi.DAO.Entites;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "Foyer")
public class Foyer {
    @Id
    @Column(name = "idFoyer")
    @GeneratedValue(strategy= GenerationType.IDENTITY) //auto_increment
    private long idFoyer;

    private String nomFoyer;
    private long capaciteFoyer;

    @OneToOne(mappedBy="foyer")
    Universite universite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    Set<Bloc> blocs;
}

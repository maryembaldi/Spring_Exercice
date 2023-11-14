package tn.esprit.foyer_maryem_baldi.DAO.Entites;
import jakarta.persistence.*;
import lombok.*;

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
}

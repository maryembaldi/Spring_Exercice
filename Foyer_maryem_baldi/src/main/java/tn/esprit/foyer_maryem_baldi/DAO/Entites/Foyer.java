package tn.esprit.foyer_maryem_baldi.DAO.Entites;
import jakarta.persistence.*;

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

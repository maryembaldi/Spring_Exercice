package tn.esprit.foyer_maryem_baldi.DAO.Entites;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "Universite")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Universite {
    @Id
    @Column(name = "idUniversite")
    @GeneratedValue(strategy= GenerationType.IDENTITY) //auto_increment

    private long idUniversite;
    private String nomUniversite;
    private String adresse;

    @OneToOne
    Foyer foyer;


}

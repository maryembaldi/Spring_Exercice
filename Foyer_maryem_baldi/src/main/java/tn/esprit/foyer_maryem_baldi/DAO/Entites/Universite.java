package tn.esprit.foyer_maryem_baldi.DAO.Entites;

import jakarta.persistence.*;

@Entity
@Table(name = "Universite")

public class Universite {
    @Id
    @Column(name = "idUniversite")
    @GeneratedValue(strategy= GenerationType.IDENTITY) //auto_increment

    private long idUniversite;
    private String nomUniversite;
    private String adresse;
}

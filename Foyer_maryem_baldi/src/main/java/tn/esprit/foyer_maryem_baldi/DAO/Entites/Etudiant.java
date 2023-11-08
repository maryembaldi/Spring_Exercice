package tn.esprit.foyer_maryem_baldi.DAO.Entites;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Etudiant")
public class Etudiant {
    @Id
    @Column(name = "idEtudiant")
    @GeneratedValue(strategy= GenerationType.IDENTITY) //auto_increment

    private long idEtudiant;
    private String nomEt;
    private String prenomE;
    private long cin;
    private String ecole;
    private Date dateNaissance;

}

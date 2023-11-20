package tn.esprit.foyer_maryem_baldi.DAO.Entites;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Builder

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

    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}

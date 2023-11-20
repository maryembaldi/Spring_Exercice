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

@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    @Column(name = "idReservation")

    private String idReservation;
    private Date anneeUniversitaire;
    private Boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    Set<Etudiant> etudiants;
}

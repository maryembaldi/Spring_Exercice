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
@Table(name = "Chambre")
public class Chambre {
    @Id
    @Column(name = "idChambre")
    @GeneratedValue(strategy= GenerationType.IDENTITY) //auto_increment
    private long idChambre;
    private long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @OneToMany(cascade = CascadeType.ALL)
    Set<Reservation> reservations;

    @ManyToOne
    Bloc bloc;
}

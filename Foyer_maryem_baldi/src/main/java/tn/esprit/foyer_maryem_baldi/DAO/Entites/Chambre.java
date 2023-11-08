package tn.esprit.foyer_maryem_baldi.DAO.Entites;

import jakarta.persistence.*;


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
}

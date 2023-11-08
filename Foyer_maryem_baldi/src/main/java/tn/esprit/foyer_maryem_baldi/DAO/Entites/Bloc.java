package tn.esprit.foyer_maryem_baldi.DAO.Entites;

import jakarta.persistence.*;

@Entity
@Table(name = "Bloc")
public class Bloc {
    @Id
    @Column(name = "idBloc")
    @GeneratedValue(strategy= GenerationType.IDENTITY) //auto_increment
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

}

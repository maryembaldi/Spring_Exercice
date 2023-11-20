package tn.esprit.foyer_maryem_baldi.DAO.Entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@ToString
@EqualsAndHashCode

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity //obligatoire : entité JPA
@Table(name = "Bloc")
public class Bloc {
    @Id //obligatoire
    @Column(name = "idBloc")
    @GeneratedValue(strategy= GenerationType.IDENTITY) //auto_increment
    long idBloc;
    String nomBloc;
    long capaciteBloc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    Set<Chambre> chambre;
    @ManyToOne
    Foyer foyer;

}

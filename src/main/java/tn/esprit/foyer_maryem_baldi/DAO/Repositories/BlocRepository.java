package tn.esprit.foyer_maryem_baldi.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Bloc;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Foyer;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    //*select * from bloc where nombloc=

    Bloc getByNomBloc (String nomBloc);

    //*select * from bolc where nomBloc= and capaciteBloc=

    Bloc getByNomBlocAndCapaciteBloc (String nomBloc, int capaciteBloc) ;

    //*select * from bolc where nomBloc= Or capaciteBloc=
    Bloc getByNomBlocOrCapaciteBloc (String nomBloc, int capaciteBloc) ;

    // 1- Recherche par nomBloc
    Bloc findByNomBloc(String nomBloc);

    // 2- Recherche par capaciteBloc
    List<Bloc> findByCapaciteBloc(long capaciteBloc);

    // 3- Recherche par nomBloc et capaciteBloc
    Bloc findByNomBlocAndCapaciteBloc(String nomBloc, long capaciteBloc);

    // 4- Recherche par nomBloc en ignorant la casse
    Bloc findByNomBlocIgnoreCase(String nomBloc);

    // 5- Recherche par capaciteBloc supérieure à une valeur donnée
    List<Bloc> findByCapaciteBlocGreaterThan(long capaciteBloc);

    // 6- Recherche par nomBloc contenant une sous-chaîne
    List<Bloc> findByNomBlocContaining(String sousChaine);

    // 7- Tri par nomBloc par ordre alphabétique
    List<Bloc> findByOrderByNomBlocAsc();

    // 8- Recherche par nomBloc ou capaciteBloc
    List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc, long capaciteBloc);

    // 9- Recherche du bloc d'un foyer spécifique
    Bloc findByFoyer(Foyer foyer);

    // 10- Recherche du bloc pour un foyer d'une université donnée
    Bloc findByFoyerUniversiteNomUniversite(String nomUniversite);
}



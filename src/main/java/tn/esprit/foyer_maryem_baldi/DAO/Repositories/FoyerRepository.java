package tn.esprit.foyer_maryem_baldi.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Chambre;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Foyer;

import java.util.Set;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {

    Foyer findByNomFoyer(String nom);
    //select * from foyer where capaciteFoyer >
    Foyer findByCapaciteFoyerGreaterThan (int capacite);
    //select * from foyer where capaciteFoyer <

    Foyer findByCapaciteFoyerLessThan (int capacite);

    //select * from foyer where capaciteFoyer < .. and capaciteFoyer >..

    Foyer findByCapaciteFoyerBetween(int min, int max);

    //Afficher le foyer de l'université dont son nom est passé en paramètre.
    //select f from foyer f join Universite u on<Condition de jointure> where <condition>

    Foyer findByUniversiteNomUniversite (String nom);


    // 1- Recherche des foyers d'un bloc spécifique
    Set<Foyer> findByBlocsNomBloc(String nomBloc);

    // 2- Recherche du foyer par son idFoyer pour un bloc donné
    Foyer findByIdFoyerAndBlocsNomBloc(long idFoyer, String nomBloc);

    // 3- Recherche des foyers d'un bloc ayant une capacité spécifique
    Set<Foyer> findByBlocsNomBlocAndCapaciteFoyer(String nomBloc, int capacite);

    // 4- Recherche du foyer d'un bloc spécifique dans une université donnée
    Foyer findByBlocsNomBlocAndUniversiteNomUniversite(String nomBloc, String nomUniversite);

}



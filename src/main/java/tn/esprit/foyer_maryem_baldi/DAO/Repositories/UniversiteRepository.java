package tn.esprit.foyer_maryem_baldi.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Chambre;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Universite;

import java.util.Date;
import java.util.List;


//JpaRepository hia l interface eli t'implementi classe eli feha
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    // 1- Afficher la liste des universités qui ont des étudiants dont leurs noms contiennent
    // la chaîne de caractères en paramètre et leurs dates de naissance entre deux dates passées en paramètre
    List<Universite> findByFoyerEtudiantsNomEtContainsAndFoyerEtudiantsDateNaissanceBetween(
            String nomEtudiant, Date dateDebut, Date dateFin);
}

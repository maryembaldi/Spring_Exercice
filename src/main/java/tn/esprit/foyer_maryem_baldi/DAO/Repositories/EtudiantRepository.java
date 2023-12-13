package tn.esprit.foyer_maryem_baldi.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Chambre;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Etudiant;

import java.util.Date;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    //select * from etudiant where nomEt like ...
    List<Etudiant> findByNomEtLike(String nom);
    List<Etudiant> findByNomEtContains(String nom);

    // 1- Recherche par nom et prénom de l'étudiant
    List<Etudiant> findByNomEtAndPrenomE(String nom, String prenom);

    // 2- Recherche par CIN de l'étudiant
    Etudiant findByCin(long cin);

    // 3- Recherche des étudiants par date de naissance après une certaine date
    List<Etudiant> findByDateNaissanceAfter(Date date);

    // 4- Recherche des étudiants par nom d'école
    List<Etudiant> findByEcole(String ecole);

    // 5- Recherche des étudiants par réservation (id de réservation)
    List<Etudiant> findByReservationsIdReservation(long idReservation);

    // 6- Recherche des étudiants par réservation (année de réservation)
    List<Etudiant> findByReservationsAnnee(int annee);

    // 7- Recherche des étudiants par nom d'école et date de naissance après une certaine date
    List<Etudiant> findByEcoleAndDateNaissanceAfter(String ecole, Date date);

    // 8- Recherche des étudiants par réservation pour une année donnée et triés par date de naissance
    List<Etudiant> findByReservationsAnneeOrderByDateNaissanceAsc(int annee);

    // 9- afficher le nombre total des etudiants
    int countByCin(int cin);



}

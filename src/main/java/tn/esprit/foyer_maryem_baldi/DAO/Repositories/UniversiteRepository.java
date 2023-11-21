package tn.esprit.foyer_maryem_baldi.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Chambre;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Universite;


//JpaRepository hia l interface eli t'implementi classe eli feha
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}

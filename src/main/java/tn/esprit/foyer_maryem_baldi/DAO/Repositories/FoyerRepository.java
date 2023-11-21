package tn.esprit.foyer_maryem_baldi.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Chambre;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Foyer;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}

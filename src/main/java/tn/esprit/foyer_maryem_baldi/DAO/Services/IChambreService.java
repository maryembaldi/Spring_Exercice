package tn.esprit.foyer_maryem_baldi.DAO.Services;

import tn.esprit.foyer_maryem_baldi.DAO.Entites.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> getAllChambres();
    Chambre addChambre(Chambre e);
    void removeChambre(long id);
    Chambre modifyChambre(Chambre e, long id);

}

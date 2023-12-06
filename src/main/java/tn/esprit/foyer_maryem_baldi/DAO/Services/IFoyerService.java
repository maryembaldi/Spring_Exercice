package tn.esprit.foyer_maryem_baldi.DAO.Services;

import tn.esprit.foyer_maryem_baldi.DAO.Entites.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> getAllFoyers();
    Foyer addFoyer(Foyer e);
    void removeFoyer(long id);
    Foyer modifyFoyer(Foyer e, long id);
}

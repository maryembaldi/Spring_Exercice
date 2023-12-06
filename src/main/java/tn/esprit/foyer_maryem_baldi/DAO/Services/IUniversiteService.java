package tn.esprit.foyer_maryem_baldi.DAO.Services;

import tn.esprit.foyer_maryem_baldi.DAO.Entites.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> getAllUniversites();
    Universite addUniversite(Universite e);
    void removeUniversite(long id);
    Universite modifyUniversite(Universite e, long id);
}

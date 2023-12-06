package tn.esprit.foyer_maryem_baldi.DAO.Services;

import tn.esprit.foyer_maryem_baldi.DAO.Entites.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> getAllBlocks();
    Bloc addBlock(Bloc e);
    void removeBlock(long id);
    Bloc modifyBlock(Bloc e, long id);
}

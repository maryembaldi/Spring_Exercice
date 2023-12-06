package tn.esprit.foyer_maryem_baldi.DAO.Services;

import tn.esprit.foyer_maryem_baldi.DAO.Entites.Etudiant;

import java.util.List;

public interface IEtudiantService {

    List<Etudiant> getAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    void removeEtudiant(long id);
    Etudiant modifyEtudiant(Etudiant e, long id);
}

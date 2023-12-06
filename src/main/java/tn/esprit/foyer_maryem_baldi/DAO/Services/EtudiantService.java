package tn.esprit.foyer_maryem_baldi.DAO.Services;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Etudiant;
import tn.esprit.foyer_maryem_baldi.DAO.Repositories.BlocRepository;
import tn.esprit.foyer_maryem_baldi.DAO.Repositories.EtudiantRepository;

import java.util.List;

@Service //définir que c'est un bean Sprint
@AllArgsConstructor //Pour injincter un bean spring dzns une autre bean
@Primary

public class EtudiantService implements IEtudiantService {
    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void removeEtudiant(long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant e,long id) {
        Etudiant eModify = etudiantRepository.findById(id).get();
        eModify.setNomEt(e.getNomEt());
        eModify.setPrenomE(e.getPrenomE());
        eModify.setCin(e.getCin());
        eModify.setEcole(e.getEcole());
        return etudiantRepository.save(eModify);
    }

}

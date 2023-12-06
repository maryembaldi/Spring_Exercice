package tn.esprit.foyer_maryem_baldi.DAO.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Universite;
import tn.esprit.foyer_maryem_baldi.DAO.Repositories.BlocRepository;
import tn.esprit.foyer_maryem_baldi.DAO.Repositories.UniversiteRepository;

import java.util.List;

@Service //définir que c'est un bean Sprint
@AllArgsConstructor //Pour injincter un bean spring dzns une autre bean
@Primary
public class UniversiteService implements IUniversiteService{
    UniversiteRepository universiteRepository;
    FoyerService foyerService;

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite e) {
        if(e.getFoyer() != null){
            foyerService.addFoyer(e.getFoyer());
        }
        return universiteRepository.save(e);
    }

    @Override
    public void removeUniversite(long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public Universite modifyUniversite(Universite updatedUniversite, long id) {
        Universite universiteToModify = universiteRepository.findById(id).orElse(null);

        if (universiteToModify != null) {
            universiteToModify.setNomUniversite(updatedUniversite.getNomUniversite());
            universiteToModify.setAdresse(updatedUniversite.getAdresse());

            return universiteRepository.save(universiteToModify);
        } else {
            throw new EntityNotFoundException("Universite with ID " + id + " not found");
        }
    }
}

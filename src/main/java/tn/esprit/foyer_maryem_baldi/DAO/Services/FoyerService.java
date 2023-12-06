package tn.esprit.foyer_maryem_baldi.DAO.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Foyer;
import tn.esprit.foyer_maryem_baldi.DAO.Repositories.BlocRepository;
import tn.esprit.foyer_maryem_baldi.DAO.Repositories.FoyerRepository;

import java.util.List;

@Service //définir que c'est un bean Sprint
@AllArgsConstructor //Pour injincter un bean spring dzns une autre bean
@Primary
public class FoyerService implements IFoyerService {
    FoyerRepository foyerRepository;

    @Override
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer e) {
        return foyerRepository.save(e);
    }

    @Override
    public void removeFoyer(long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public Foyer modifyFoyer(Foyer updatedFoyer, long id) {
        Foyer foyerToModify = foyerRepository.findById(id).orElse(null);

        if (foyerToModify != null) {
            foyerToModify.setNomFoyer(updatedFoyer.getNomFoyer());
            foyerToModify.setCapaciteFoyer(updatedFoyer.getCapaciteFoyer());

            return foyerRepository.save(foyerToModify);
        } else {
            throw new EntityNotFoundException("Foyer with ID " + id + " not found");
        }
    }
}

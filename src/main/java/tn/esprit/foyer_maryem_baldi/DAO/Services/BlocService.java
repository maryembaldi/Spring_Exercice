package tn.esprit.foyer_maryem_baldi.DAO.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Bloc;
import tn.esprit.foyer_maryem_baldi.DAO.Repositories.BlocRepository;

import java.util.List;

@Service //définir que c'est un bean Sprint
@AllArgsConstructor //Pour injincter un bean spring dzns une autre bean
@Primary
public class BlocService implements IBlocService {
    BlocRepository blocRepository;


    @Override
    public List<Bloc> getAllBlocks() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc addBlock(Bloc e) {
        return blocRepository.save(e);
    }

    @Override
    public void removeBlock(long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public Bloc modifyBlock(Bloc e, long id) {
        Bloc blocToModify = blocRepository.findById(id).orElse(null);

        if (blocToModify != null) {
            blocToModify.setNomBloc(e.getNomBloc());
            blocToModify.setCapaciteBloc(e.getCapaciteBloc());

            return blocRepository.save(blocToModify);
        } else {
            throw new EntityNotFoundException("Bloc with ID " + id + " not found");
        }
    }
}

package tn.esprit.foyer_maryem_baldi.DAO.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Chambre;
import tn.esprit.foyer_maryem_baldi.DAO.Repositories.ChambreRepository;

import java.util.List;

@Primary
@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {
    ChambreRepository chambreRepository;
    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre e) {
        return chambreRepository.save(e);
    }

    @Override
    public void removeChambre(long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public Chambre modifyChambre(Chambre e, long id) {
        Chambre chambreToModify = chambreRepository.findById(id).orElse(null);

        if (chambreToModify != null) {
            chambreToModify.setNumeroChambre(e.getNumeroChambre());
            chambreToModify.setTypeC(e.getTypeC());
            // You can update other properties here if needed

            return chambreRepository.save(chambreToModify);
        } else {
            throw new EntityNotFoundException("Chambre with ID " + id + " not found");
        }
    }
}

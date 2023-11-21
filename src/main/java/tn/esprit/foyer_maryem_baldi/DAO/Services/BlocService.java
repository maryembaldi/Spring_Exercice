package tn.esprit.foyer_maryem_baldi.DAO.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_maryem_baldi.DAO.Repositories.BlocRepository;

@Service //définir que c'est un bean Sprint
@AllArgsConstructor //Pour injincter un bean spring dzns une autre bean
public class BlocService implements IBlocService {
    BlocRepository blocRepository;
}

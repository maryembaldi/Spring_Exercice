package tn.esprit.foyer_maryem_baldi.DAO.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Reservation;
import tn.esprit.foyer_maryem_baldi.DAO.Repositories.BlocRepository;
import tn.esprit.foyer_maryem_baldi.DAO.Repositories.ReservationRepository;

import java.util.List;

@Service //définir que c'est un bean Sprint
@AllArgsConstructor //Pour injincter un bean spring dzns une autre bean
@Primary
public class ReservationService implements IReservationService {
    ReservationRepository reservationRepository;

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation e) {
        return reservationRepository.save(e);
    }

    @Override
    public void removeReservation(String id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Reservation modifyReservation(Reservation updatedReservation, String id) {
        Reservation reservationToModify = reservationRepository.findById(id).orElse(null);

        if (reservationToModify != null) {
            reservationToModify.setAnneeUniversitaire(updatedReservation.getAnneeUniversitaire());
            reservationToModify.setEstValide(updatedReservation.getEstValide());

            return reservationRepository.save(reservationToModify);
        } else {
            throw new EntityNotFoundException("Reservation with ID " + id + " not found");
        }
    }
}

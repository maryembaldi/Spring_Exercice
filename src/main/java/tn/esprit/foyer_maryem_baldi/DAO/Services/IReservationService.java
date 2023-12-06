package tn.esprit.foyer_maryem_baldi.DAO.Services;

import tn.esprit.foyer_maryem_baldi.DAO.Entites.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> getAllReservations();
    Reservation addReservation(Reservation e);
    void removeReservation(String id);
    Reservation modifyReservation(Reservation e, String id);
}

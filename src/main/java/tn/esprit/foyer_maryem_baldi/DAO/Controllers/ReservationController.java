package tn.esprit.foyer_maryem_baldi.DAO.Controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Reservation;
import tn.esprit.foyer_maryem_baldi.DAO.Services.ReservationService;

import java.util.List;

@RestController
@RequestMapping("/Reservation")
public class ReservationController {

    ReservationService reservationService;

    @GetMapping("getAllReservations")
    public ResponseEntity<List<Reservation>> getAllReservations(){
        List<Reservation> reservations = reservationService.getAllReservations();
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

    @PostMapping("addReservation")
    public ResponseEntity<Reservation> addReservation(@RequestBody Reservation reservation){
        Reservation addedReservation = reservationService.addReservation(reservation);
        return new ResponseEntity<>(addedReservation, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable String id){
        reservationService.removeReservation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Reservation> modifyReservation(@RequestBody Reservation reservation, @PathVariable String id){
        Reservation modifiedReservation = reservationService.modifyReservation(reservation, id);
        return new ResponseEntity<>(modifiedReservation, HttpStatus.ACCEPTED);
    }
}

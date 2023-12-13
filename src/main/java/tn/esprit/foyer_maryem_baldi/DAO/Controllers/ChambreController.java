package tn.esprit.foyer_maryem_baldi.DAO.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Chambre;
import tn.esprit.foyer_maryem_baldi.DAO.Services.ChambreService;

import java.util.List;

@RestController
@RequestMapping("/Chambre")
public class ChambreController {

    ChambreService chambreService;

    @GetMapping("getAllChambres")
    public ResponseEntity<List<Chambre>> getAllChambres(){
        List<Chambre> chambres = chambreService.getAllChambres();
        return new ResponseEntity<>(chambres, HttpStatus.OK);
    }

    @PostMapping("addChambre")
    public ResponseEntity<Chambre> addChambre(@RequestBody Chambre chambre){
        Chambre addedChambre = chambreService.addChambre(chambre);
        return new ResponseEntity<>(addedChambre, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChambre(@PathVariable long id){
        chambreService.removeChambre(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Chambre> modifyChambre(@RequestBody Chambre chambre, @PathVariable long id){
        Chambre modifiedChambre = chambreService.modifyChambre(chambre, id);
        return new ResponseEntity<>(modifiedChambre, HttpStatus.ACCEPTED);
    }
}

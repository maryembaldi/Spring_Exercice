package tn.esprit.foyer_maryem_baldi.DAO.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Foyer;
import tn.esprit.foyer_maryem_baldi.DAO.Services.FoyerService;

import java.util.List;

@RestController
@RequestMapping("/Foyer")

public class FoyerController {

    FoyerService foyerService;

    @GetMapping("getAllFoyers")
    public ResponseEntity<List<Foyer>> getAllFoyers(){
        List<Foyer> foyers = foyerService.getAllFoyers();
        return new ResponseEntity<>(foyers, HttpStatus.OK);
    }

    @PostMapping("addFoyer")
    public ResponseEntity<Foyer> addFoyer(@RequestBody Foyer foyer){
        Foyer addedFoyer = foyerService.addFoyer(foyer);
        return new ResponseEntity<>(addedFoyer, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFoyer(@PathVariable long id){
        foyerService.removeFoyer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Foyer> modifyFoyer(@RequestBody Foyer foyer, @PathVariable long id){
        Foyer modifiedFoyer = foyerService.modifyFoyer(foyer, id);
        return new ResponseEntity<>(modifiedFoyer, HttpStatus.ACCEPTED);
    }
}

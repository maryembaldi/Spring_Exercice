package tn.esprit.foyer_maryem_baldi.DAO.Controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Etudiant;
import tn.esprit.foyer_maryem_baldi.DAO.Services.EtudiantService;

import java.util.List;

@RestController
@RequestMapping("/Etudiant")
public class EtudiantController {
    EtudiantService etudiantService;

    @GetMapping("getAllEtudiant")
    public ResponseEntity<List<Etudiant>> getAllEtudiant(){
        List<Etudiant> e = etudiantService.getAllEtudiants();
        return new  ResponseEntity<List<Etudiant>>(e, HttpStatus.OK);
    }

    @PostMapping("ajouterEtudiant")
    public ResponseEntity<Etudiant> ajouterEtudiant(@RequestBody Etudiant e){
        Etudiant etudiantAjouter = etudiantService.addEtudiant(e);
        return new ResponseEntity<Etudiant>(etudiantAjouter,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteEtudiant(@PathVariable long id){
        etudiantService.removeEtudiant(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Etudiant> modiferEudiant(@RequestBody Etudiant e,@PathVariable long id){
        Etudiant etudiant = etudiantService.modifyEtudiant(e,id);
        return new ResponseEntity<Etudiant>(etudiant,HttpStatus.ACCEPTED);
    }
}

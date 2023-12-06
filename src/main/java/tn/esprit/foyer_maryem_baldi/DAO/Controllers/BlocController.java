package tn.esprit.foyer_maryem_baldi.DAO.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Bloc;
import tn.esprit.foyer_maryem_baldi.DAO.Services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/Bloc")
public class BlocController {

    @Autowired
    IBlocService blocService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Bloc>> getAllBlocks(){
        List<Bloc> blocks = blocService.getAllBlocks();
        return new ResponseEntity<>(blocks, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Bloc> addBlock(@RequestBody Bloc block){
        Bloc addedBlock = blocService.addBlock(block);
        return new ResponseEntity<>(addedBlock, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlock(@PathVariable long id){
        blocService.removeBlock(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Bloc> modifyBlock(@RequestBody Bloc block, @PathVariable long id){
        Bloc modifiedBlock = blocService.modifyBlock(block, id);
        return new ResponseEntity<>(modifiedBlock, HttpStatus.ACCEPTED);
    }
}

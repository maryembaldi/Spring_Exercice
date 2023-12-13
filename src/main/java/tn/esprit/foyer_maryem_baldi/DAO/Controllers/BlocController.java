package tn.esprit.foyer_maryem_baldi.DAO.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_maryem_baldi.DAO.Entites.Bloc;
import tn.esprit.foyer_maryem_baldi.DAO.Services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/Bloc")
public class BlocController {

    IBlocService blocService;

    @GetMapping("getAllBlocs")
    public ResponseEntity<List<Bloc>> getAllBlocks(){
        List<Bloc> blocks = blocService.getAllBlocks();
        return new ResponseEntity<>(blocks, HttpStatus.OK);
    }

    @PostMapping("addBloc")
    public ResponseEntity<Bloc> addBlock(@RequestBody Bloc block){
        Bloc addedBlock = blocService.addBlock(block);
        return new ResponseEntity<>(addedBlock, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlock(@PathVariable long id){
        blocService.removeBlock(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("updateBloc")
    public ResponseEntity<Bloc> modifyBlock(@RequestBody Bloc block, @PathVariable long id){
        Bloc modifiedBlock = blocService.modifyBlock(block, id);
        return new ResponseEntity<>(modifiedBlock, HttpStatus.ACCEPTED);
    }
}

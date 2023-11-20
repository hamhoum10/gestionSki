package tn.esprit.gestionski.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionski.entities.Piste;
import tn.esprit.gestionski.services.PisteServiceImp;

import java.util.List;

@AllArgsConstructor
@RestController
public class PisteController {
    private PisteServiceImp PisteServiceImp;

    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste f){ // @RequestBody when we pass object
        return PisteServiceImp.addPiste(f);
    }

    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste f){
        return PisteServiceImp.updatePiste(f);
    }

    @GetMapping("/getallPiste")
    public List<Piste> findAllPiste(){
        return PisteServiceImp.findAllPiste();
    }

    @GetMapping("/getbyidPiste/{id}")
    public Piste findByIdPiste(@PathVariable long id){ //@PathVariable cuz we pass the id in paramete to the path / when we passe just a variable
        return PisteServiceImp.findByIdPiste(id);
    }

    @DeleteMapping("/deletePiste/{id}")
    public void deleteById(@PathVariable long id){
        PisteServiceImp.deletePiste(id);
    }

}

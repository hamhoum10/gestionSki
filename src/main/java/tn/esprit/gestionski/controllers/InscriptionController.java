package tn.esprit.gestionski.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionski.entities.Inscription;
import tn.esprit.gestionski.entities.Skieur;
import tn.esprit.gestionski.services.InscriptionServiceImp;

import java.util.List;

@AllArgsConstructor
@RestController
public class InscriptionController {
    private InscriptionServiceImp InscriptionServiceImp;

    @PostMapping("/addInscription")
    public Inscription addInscription(@RequestBody Inscription f){ // @RequestBody when we pass object
        return InscriptionServiceImp.addInscription(f);
    }
    @PostMapping("/addskieurski/{skieur}")
    public Inscription addInscriptionSkieur(@RequestBody Inscription f , @PathVariable long skieur){
        return  InscriptionServiceImp.addInscriptionToSkieur(f,skieur);
    }
    @PostMapping("/addcour/{skieur}")
    public Inscription addInscriptionCours(@RequestBody Inscription f , @PathVariable long skieur){
        return  InscriptionServiceImp.addInscriptionToCour(f,skieur);
    }

    @PutMapping("/updateInscription")
    public Inscription updateInscription(@RequestBody Inscription f){
        return InscriptionServiceImp.updateInscription(f);
    }

    @GetMapping("/getallInscription")
    public List<Inscription> findAllInscription(){
        return InscriptionServiceImp.findAllInscription();
    }

    @GetMapping("/getbyidInscription/{id}")
    public Inscription findByIdInscription(@PathVariable long id){ //@PathVariable cuz we pass the id in paramete to the path / when we passe just a variable
        return InscriptionServiceImp.findByIdInscription(id);
    }

    @DeleteMapping("/deleteInscription/{id}")
    public void deleteById(@PathVariable long id){
        InscriptionServiceImp.deleteInscription(id);
    }

}

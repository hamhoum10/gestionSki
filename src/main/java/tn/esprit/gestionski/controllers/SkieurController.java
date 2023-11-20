package tn.esprit.gestionski.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionski.entities.Skieur;
import tn.esprit.gestionski.entities.TypeAbonnement;
import tn.esprit.gestionski.services.SkieurServiceImp;

import java.util.List;

@AllArgsConstructor
@RestController
public class SkieurController {
    private SkieurServiceImp SkieurServiceImp;

    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur f){ // @RequestBody when we pass object
        return SkieurServiceImp.addSkieur(f);
    }
    @PostMapping("addpist4/{numPiste}")
    public Skieur addSkieurpist(@RequestBody long numSkieur,@PathVariable long numPiste){ // @RequestBody when we pass object
        return SkieurServiceImp.assignSkierToPiste(numSkieur,numPiste);
    }

    @PutMapping("/updateSkieur")
    public Skieur updateSkieur(@RequestBody Skieur f){
        return SkieurServiceImp.updateSkieur(f);
    }

    @GetMapping("/getallSkieur")
    public List<Skieur> findAllSkieur(){
        return SkieurServiceImp.findAllSkieur();
    }

    @GetMapping("/getbyidSkieur/{id}")
    public Skieur findByIdSkieur(@PathVariable long id){ //@PathVariable cuz we pass the id in paramete to the path / when we passe just a variable
        return SkieurServiceImp.findByIdSkieur(id);
    }

    @DeleteMapping("/deleteSkieur/{id}")
    public void deleteById(@PathVariable long id){
        SkieurServiceImp.deleteSkieur(id);
    }
    @PostMapping("assinskitopist/{numski}/{numpist}")
    public Skieur assignSkierToPiste(@PathVariable long numski,@PathVariable long numpist){
        return SkieurServiceImp.assignSkierToPiste(numski,numpist);
    }

    @PostMapping("addskieurAndAssignToCour/{num}")
    public Skieur addskieurAndAssignToCour(@RequestBody Skieur skieur,@PathVariable long num){
      return SkieurServiceImp.addSkieurAndAssignToCour(skieur,num);
    }
    @GetMapping("getbyType/{type}")
    public List<Skieur> getSkieurByType(@PathVariable TypeAbonnement type){
    return SkieurServiceImp.retiveskieurByTypeAbonnement(type);}
}

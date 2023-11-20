package tn.esprit.gestionski.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.gestionski.entities.Moniteur;
import tn.esprit.gestionski.services.IMoniteur;

@RestController
@AllArgsConstructor
public class MoniteurController {
IMoniteur iMoniteur;

@PostMapping("addMoniteurToCour/{num}")
public Moniteur addMoniteurAndAssignToCour(@RequestBody Moniteur moniteur, @PathVariable long num){
    return iMoniteur.addMoniteurAndAssignToCour(moniteur,num);
}
}

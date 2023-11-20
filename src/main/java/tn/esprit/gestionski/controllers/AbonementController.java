package tn.esprit.gestionski.controllers;


import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionski.entities.Abonnement;
import tn.esprit.gestionski.entities.Skieur;
import tn.esprit.gestionski.entities.TypeAbonnement;
import tn.esprit.gestionski.services.AbonementServiceImp;
import tn.esprit.gestionski.services.SkieurServiceImp;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@RestController
public class AbonementController {
    private AbonementServiceImp abonementServiceImp;


    @GetMapping("getbyTypeandordred/{typeAbonnement}")
    public List<Abonnement> getandordred(@PathVariable TypeAbonnement typeAbonnement){
        return abonementServiceImp.getSubscriptionByType(typeAbonnement);}



    @GetMapping("getbyTypeandordred/{begin}/{end}")
    public List<Abonnement> getbydatebeginend(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date begin, @PathVariable  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)Date end){
        return abonementServiceImp.findAbonnementByDateDebutBetween(begin, end);}
}

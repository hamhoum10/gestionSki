package tn.esprit.gestionski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionski.entities.*;
import tn.esprit.gestionski.repositories.CoursRepository;
import tn.esprit.gestionski.repositories.InscriptionRepository;
import tn.esprit.gestionski.repositories.PisteRepository;
import tn.esprit.gestionski.repositories.SkieurRepository;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class SkieurServiceImp implements ISkieur{
    private CoursRepository coursRepository;
    private SkieurRepository skieurRepository;
    private PisteRepository pisteRepository;
    private InscriptionRepository inscriptionRepository;
    @Override
    public Skieur addSkieur(Skieur s) {
        return skieurRepository.save(s);
    }


    @Override
    public Skieur updateSkieur(Skieur s) {
        return skieurRepository.save(s);
    }

    @Override
    public List<Skieur> findAllSkieur() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur findByIdSkieur(long id) {
        return skieurRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteSkieur(long id) {
        skieurRepository.deleteById(id);
    }

    @Override
    public Skieur assignSkierToPiste(long numSkieur, long numPiste) {
        List<Piste> pistes = new ArrayList<>();
        List<Skieur> skieurs = new ArrayList<>();
        Skieur restSkieur = new Skieur();
        pistes.add(pisteRepository.findById(numPiste).orElse(null));
        skieurs.add(skieurRepository.findById(numSkieur).orElse(null));
        for (Skieur skieur:skieurs) {
            skieur.setListPiste(pistes);
            restSkieur = skieur;
        }
        for (Piste piste:pistes) {
            piste.setSkieurList(skieurs);
        }
        pisteRepository.saveAll(pistes);
        skieurRepository.saveAll(skieurs);
        return restSkieur;

    }

    @Override
    public Skieur addSkieurAndAssignToCour(Skieur skieur,long num) {
        Skieur saverdSkieur=skieurRepository.save(skieur);
        Cours cours=coursRepository.findById(num).orElse(null);
        List<Inscription>inscriptionList=saverdSkieur.getInscriptions();
        for(Inscription i :inscriptionList){
            i.setSkieur(saverdSkieur);
            i.setCours(cours);
            inscriptionRepository.save(i);
        }
        return skieurRepository.save(skieur);
    }

    @Override
    public List<Skieur> retiveskieurByTypeAbonnement(TypeAbonnement typeAbonnement) {
        return skieurRepository.findByAbonnement_TypeAbon(typeAbonnement);
    }

}

package tn.esprit.gestionski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionski.entities.Cours;
import tn.esprit.gestionski.entities.Inscription;
import tn.esprit.gestionski.entities.Skieur;
import tn.esprit.gestionski.repositories.CoursRepository;
import tn.esprit.gestionski.repositories.InscriptionRepository;
import tn.esprit.gestionski.repositories.SkieurRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class InscriptionServiceImp implements Iinscritption{

    private InscriptionRepository InscriptionRepository;
    private SkieurRepository skieurRepository;
    private CoursRepository coursRepository;
    @Override
    public Inscription addInscription(Inscription s) {
        return InscriptionRepository.save(s);
    }

    @Override
    public Inscription updateInscription(Inscription s) {
        return InscriptionRepository.save(s);
    }

    @Override
    public List<Inscription> findAllInscription() {
        return InscriptionRepository.findAll();
    }

    @Override
    public Inscription findByIdInscription(long id) {
        return InscriptionRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteInscription(long id) {
        InscriptionRepository.deleteById(id);
    }

    @Override
    public Inscription addInscriptionToSkieur(Inscription inscription, long numskieur) {
        Skieur skieur = skieurRepository.findById(numskieur).orElse(null);
        inscription.setSkieur(skieur);
        return  InscriptionRepository.save(inscription);

    }

    @Override
    public Inscription addInscriptionToCour(Inscription inscription, long numcour) {
        Cours cours = coursRepository.findById(numcour).orElse(null);
        inscription.setCours(cours);
        return InscriptionRepository.save(inscription);
    }

    @Override
    public Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours) {
        return null;
    }

}

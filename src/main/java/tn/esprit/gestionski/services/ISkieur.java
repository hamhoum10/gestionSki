package tn.esprit.gestionski.services;

import tn.esprit.gestionski.entities.Skieur;
import tn.esprit.gestionski.entities.TypeAbonnement;

import java.util.List;

public interface ISkieur {
    public Skieur addSkieur(Skieur f);
    public Skieur updateSkieur(Skieur f);
    public List<Skieur> findAllSkieur();
    public Skieur findByIdSkieur(long id);
    public void deleteSkieur(long id);
    public Skieur assignSkierToPiste(long numSkieur, long numPiste);
    public Skieur addSkieurAndAssignToCour(Skieur skieur,long num);
    public List<Skieur> retiveskieurByTypeAbonnement(TypeAbonnement typeAbonnement);
}

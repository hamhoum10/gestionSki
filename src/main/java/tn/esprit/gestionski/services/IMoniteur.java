package tn.esprit.gestionski.services;

import tn.esprit.gestionski.entities.Moniteur;
import tn.esprit.gestionski.entities.Piste;

import java.util.List;

public interface IMoniteur {
  public Moniteur addMoniteurAndAssignToCour(Moniteur moniteur,long N);
}

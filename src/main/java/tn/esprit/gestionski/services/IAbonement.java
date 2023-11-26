package tn.esprit.gestionski.services;

import tn.esprit.gestionski.entities.Abonnement;
import tn.esprit.gestionski.entities.Skieur;
import tn.esprit.gestionski.entities.TypeAbonnement;

import java.util.Date;
import java.util.List;

public interface IAbonement {

    List<Abonnement> getSubscriptionByType( TypeAbonnement typeAbonnement);
    List<Abonnement>findAbonnementByDateDebutBetween(Date begin, Date dend);
    void showMonthlyRecurringRevenue();

}

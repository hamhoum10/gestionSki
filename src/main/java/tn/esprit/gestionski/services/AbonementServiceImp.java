package tn.esprit.gestionski.services;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.gestionski.entities.*;
import tn.esprit.gestionski.repositories.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Service
public class AbonementServiceImp implements IAbonement{
    private AbonementRepository abonementRepository;


    @Override
    public List<Abonnement> getSubscriptionByType(TypeAbonnement type) {
//        return abonementRepository.getSubscriptionByType(type);
    return null;}

    @Override
    public List<Abonnement> findAbonnementByDateDebutBetween(Date begin, Date dend) {
        return abonementRepository.findAbonnementByDateDebutBetween(begin,dend);
    }

    @Override
    @Scheduled(cron = "0 0 12 30 * *")
    public void showMonthlyRecurringRevenue() {
        abonementRepository.showMonthlyRecurringRevenue();


    }



}

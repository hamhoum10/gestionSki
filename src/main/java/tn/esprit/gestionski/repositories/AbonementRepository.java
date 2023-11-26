package tn.esprit.gestionski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.gestionski.entities.Abonnement;
import tn.esprit.gestionski.entities.Skieur;
import tn.esprit.gestionski.entities.TypeAbonnement;

import java.util.Date;
import java.util.List;

public interface AbonementRepository extends JpaRepository<Abonnement,Long> {
    //22  24 25 to do

//    @Query("select a from Abonnement a where a.typeAbon =: type order by a.dateDebut")
//    List<Abonnement> getSubscriptionByType(@Param("type") TypeAbonnement type);
    List<Abonnement>findAbonnementByDateDebutBetween(Date begin,Date dend);
    @Query("SELECT SUM(a.prixAbon) AS total_price FROM Abonnement a WHERE MONTH(a.dateDebut) = MONTH(CURDATE()) AND YEAR(a.dateDebut) = YEAR(CURDATE())")
    int showMonthlyRecurringRevenue();
}

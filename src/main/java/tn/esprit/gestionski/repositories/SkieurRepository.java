package tn.esprit.gestionski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionski.entities.Skieur;
import tn.esprit.gestionski.entities.TypeAbonnement;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
    List<Skieur> findByAbonnement_TypeAbon(TypeAbonnement typeAbonnement);
}

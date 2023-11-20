package tn.esprit.gestionski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionski.entities.Cours;
import tn.esprit.gestionski.entities.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur,Long> {
}

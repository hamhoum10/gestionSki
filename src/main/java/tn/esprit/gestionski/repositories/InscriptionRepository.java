package tn.esprit.gestionski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.gestionski.entities.Inscription;
import tn.esprit.gestionski.entities.Skieur;
import tn.esprit.gestionski.entities.Support;

import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
//    @Query("select e from  Inscription e  "+"join  Moniteur m "+"on e.cours")
//    List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support);

}

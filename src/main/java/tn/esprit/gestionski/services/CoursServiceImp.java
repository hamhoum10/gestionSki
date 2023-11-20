package tn.esprit.gestionski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionski.entities.Cours;
import tn.esprit.gestionski.repositories.CoursRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class CoursServiceImp implements ICours{

    private CoursRepository CoursRepository;
    @Override
    public Cours addCours(Cours s) {
        return CoursRepository.save(s);
    }


    @Override
    public Cours updateCours(Cours s) {
        return CoursRepository.save(s);
    }

    @Override
    public List<Cours> findAllCours() {
        return CoursRepository.findAll();
    }

    @Override
    public Cours findByIdCours(long id) {
        return CoursRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCours(long id) {
        CoursRepository.deleteById(id);
    }

}

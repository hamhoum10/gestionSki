package tn.esprit.gestionski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionski.entities.Piste;
import tn.esprit.gestionski.repositories.PisteRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class PisteServiceImp implements IPiste{

    private PisteRepository PisteRepository;
    @Override
    public Piste addPiste(Piste s) {
        return PisteRepository.save(s);
    }


    @Override
    public Piste updatePiste(Piste s) {
        return PisteRepository.save(s);
    }

    @Override
    public List<Piste> findAllPiste() {
        return PisteRepository.findAll();
    }

    @Override
    public Piste findByIdPiste(long id) {
        return PisteRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePiste(long id) {
        PisteRepository.deleteById(id);
    }

}

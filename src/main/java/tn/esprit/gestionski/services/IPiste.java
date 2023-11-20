package tn.esprit.gestionski.services;

import tn.esprit.gestionski.entities.Piste;

import java.util.List;

public interface IPiste {
    public Piste addPiste(Piste f);
    public Piste updatePiste(Piste f);
    public List<Piste> findAllPiste();
    public Piste findByIdPiste(long id);
    public void deletePiste(long id);
}

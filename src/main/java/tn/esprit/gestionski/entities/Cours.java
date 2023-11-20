package tn.esprit.gestionski.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Cours implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;

    private int niveau;

    @Enumerated(EnumType.STRING)
    private Typecours typeCours;

    @Enumerated(EnumType.STRING)
    private Support support;

    private Float prix;
    private int creneau;
    @JsonIgnore
    @OneToMany(mappedBy = "cours") //mapped by cause cardilaite inferrieur
    private List<Inscription> inscriptionList;


}

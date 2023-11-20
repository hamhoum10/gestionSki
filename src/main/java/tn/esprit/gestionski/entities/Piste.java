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
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;

    private String nomPiste;

    @Enumerated(EnumType.STRING)
    private Couleur couleur;

    private Long logeur;
    private Long pente;
    @JsonIgnore
    @ManyToMany(mappedBy = "listPiste") //fi fils tet7at wken ma9lsh fi ennoce 7ot winn t7b
    private List<Skieur> skieurList;
}

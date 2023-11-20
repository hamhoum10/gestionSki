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
public class Inscription  implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long numInscription;

    private int numSemaine;
    @JsonIgnore
    @ManyToOne
    private Cours cours;
    @JsonIgnore
    @ManyToOne
    private Skieur skieur;
}

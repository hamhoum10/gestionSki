package tn.esprit.gestionski.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Skieur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;

    private String nomS;
    private String prenomS;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    private String ville;
@JsonIgnore
    @ManyToMany
    private List<Piste> listPiste;

    @OneToMany(mappedBy = "skieur",cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;

    @OneToOne
    private Abonnement abonnement;

}

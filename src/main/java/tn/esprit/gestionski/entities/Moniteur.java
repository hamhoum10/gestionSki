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
public class Moniteur  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur;
    private String nomM;
    private String prenomM;

    @Temporal(TemporalType.DATE)
    private Date dateRecu;
    @JsonIgnore
    @OneToMany
    private List<Cours> coursList;
}

package io.brainkaster.paperless.referentiel;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by melbakkali on 06/04/2016.
 */

@Data
@Entity
public class Affaire {

    private
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="AFR_SEQ")
    @SequenceGenerator(name="AFR_SEQ",sequenceName="AFR_SEQ",allocationSize=1)
    Long id;
    private String codeAffaire;
    private String codeClient;
    private String label;
    private String dateDebut;
    private String dateFin;
    private String statut;
    private String description;
    private String correspondant;
    private String coordonnees;

    private Affaire() {
    }

    public Affaire(String codeAffaire,
                   String codeClient,
                   String label,
                   String dateDebut,
                   String dateFin,
                   String statut,
                   String description,
                   String correspondant,
                   String coordonnees) {
        this.codeAffaire = codeAffaire;
        this.codeClient = codeClient;
        this.label = label;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.statut = statut;
        this.description = description;
        this.correspondant = correspondant;
        this.coordonnees = coordonnees;
    }
}

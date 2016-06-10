package io.brainkaster.paperless.referentiel;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by melbakkali on 06/04/2016.
 */

@Data
@Entity
public class Fournisseur {

    private
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="FRN_SEQ")
    @SequenceGenerator(name="FRN_SEQ",sequenceName="FRN_SEQ",allocationSize=1)
    Long id;
    private String codeFournisseur;
    private String raisonSociale;
    private String adresse;
    private String numStandard;
    private String contactCompta;

    private Fournisseur() {
    }

    public Fournisseur(String codeFournisseur,
                       String raisonSociale,
                       String adresse,
                       String numStandard,
                       String contactCompta) {
        this.codeFournisseur = codeFournisseur;
        this.raisonSociale = raisonSociale;
        this.adresse = adresse;
        this.numStandard = numStandard;
        this.contactCompta = contactCompta;
    }

}

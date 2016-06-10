package io.brainkaster.paperless.referentiel;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by melbakkali on 20/04/2016.
 */

@Data
@Entity
public class Facture {

    private
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="FACTURE_SEQ")
    @SequenceGenerator(name="FACTURE_SEQ",sequenceName="FACTURE_SEQ",allocationSize=1)
    Long id;
    private String numChrono;
    private String societeImput;
    private String dateReception;
    private String numCommande;
    private String montantCommande;
    private String demandeur;
    private String fournisseur;
    private String refFactureFournisseur;
    private String dateFactureFournisseur;
    private String montantFacture;
    private String responsableFacture;
    private String imputAnalytique;
    private String echeance;
    private String numEcritureComptable;
    private String dateComptable;
    private String statut;
    private String wfBusinessKey;

    @ManyToOne
    @JoinColumn(name = "parapheur_id")
    private Parapheur parapheur;


    private Facture() {
    }

    public Facture(String numChrono,
                   String societeImput,
                   String dateReception,
                   String numCommande,
                   String montantCommande,
                   String demandeur,
                   String fournisseur,
                   String refFactureFournisseur,
                   String dateFactureFournisseur,
                   String montantFacture,
                   String responsableFacture,
                   String imputAnalytique,
                   String echeance,
                   String numEcritureComptable,
                   String dateComptable,
                   String statut,
                   String wfBusinessKey,
                   Parapheur parapheur) {
        this.numChrono = numChrono;
        this.societeImput = societeImput;
        this.dateReception = dateReception;
        this.numCommande = numCommande;
        this.montantCommande = montantCommande;
        this.demandeur = demandeur;
        this.fournisseur = fournisseur;
        this.refFactureFournisseur = refFactureFournisseur;
        this.dateFactureFournisseur = dateFactureFournisseur;
        this.montantFacture = montantFacture;
        this.responsableFacture = responsableFacture;
        this.imputAnalytique = imputAnalytique;
        this.echeance = echeance;
        this.numEcritureComptable = numEcritureComptable;
        this.dateComptable = dateComptable;
        this.statut = statut;
        this.wfBusinessKey = wfBusinessKey;
        this.parapheur = parapheur;
    }
}

package io.brainkaster.paperless.referentiel;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by melbakkali on 26/04/2016.
 */
@Data
@Entity
public class Parapheur {

    private
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PARAPH_SEQ")
    @SequenceGenerator(name="PARAPH_SEQ",sequenceName="PARAPH_SEQ",allocationSize=1)
    Long id;
    private String numParapheur;
    private String dateCreation;
    private String echeanceParapheur;
    private String typeParapheur;
    private String statutParapheur;

    @OneToMany
    private List<Facture> factures;

    private Parapheur() {
    }

    public Parapheur(String numParapheur,
                       String dateCreation,
                       String echeanceParapheur,
                       String typeParapheur,
                       String statutParapheur,
                       List<Facture> factures) {
        this.numParapheur = numParapheur;
        this.dateCreation = dateCreation;
        this.echeanceParapheur = echeanceParapheur;
        this.typeParapheur = typeParapheur;
        this.statutParapheur = statutParapheur;
        this.factures = factures;
    }
}

package io.brainkaster.paperless.repositories;

import io.brainkaster.paperless.referentiel.Affaire;
import io.brainkaster.paperless.referentiel.Fournisseur;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by melbakkali on 25/04/2016.
 */
public interface AffaireRepository extends PagingAndSortingRepository<Affaire, Long> {

}
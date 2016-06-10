package io.brainkaster.paperless.repositories;

import io.brainkaster.paperless.referentiel.Fournisseur;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by melbakkali on 21/04/2016.
 */
public interface FournisseurRepository extends PagingAndSortingRepository<Fournisseur, Long> {

}
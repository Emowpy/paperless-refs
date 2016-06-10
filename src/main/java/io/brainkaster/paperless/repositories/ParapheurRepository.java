package io.brainkaster.paperless.repositories;

import io.brainkaster.paperless.referentiel.Parapheur;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by melbakkali on 26/04/2016.
 */
public interface ParapheurRepository extends PagingAndSortingRepository<Parapheur, Long> {

    Parapheur findByNumParapheur(@Param("numParapheur") String numParapheur);

}
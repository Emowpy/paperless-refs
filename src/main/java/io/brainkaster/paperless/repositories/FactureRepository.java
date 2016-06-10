package io.brainkaster.paperless.repositories;

import io.brainkaster.paperless.referentiel.Facture;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by melbakkali on 06/04/2016.
 */
public interface FactureRepository extends PagingAndSortingRepository<Facture, Long> {

    Facture findTopByOrderByNumChronoDesc();

    List<Facture> findByFournisseur(@Param("fournisseur") String fournisseur);

    List<Facture> findByDateReception(@Param("dateReception") String dateReception);

    List<Facture> findByDateFactureFournisseur(@Param("dateFactureFournisseur") String dateFactureFournisseur);

    List<Facture> findByRefFactureFournisseur(@Param("refFactureFournisseur") String refFactureFournisseur);
}
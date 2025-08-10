package ca.vrg_online.app.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link ca.vrg_online.app.entities.TalonDePaye}
 */
@Value
public class TalonDePayeDto implements Serializable {
    Long id;
    Date dateDePaiement;
    Date periodeDateDebut;
    Date periodeDatefin;
    Double salaireRegulierHeures;
    Double salaireRegulierMontant;
    Double salaireRegulierCumul;
    Double vacancesHrsCumul;
    Double vacancesCumul;
    Double surtemps15HrsCumul;
    Double surtemps15Cumul;
    Double surtemps20HrsCumul;
    Double surtemps20Cumul;
    Double congeFlottantHrsCumul;
    Double congeFlottantCumul;
    Double congeFerieHrsCumul;
    Double congeFerieCumul;
    Double boniHrsCumul;
    Double boniCumul;
    Double actionHrsCumul;
    Double actionCumul;
    Double impotFedCourant;
    Double impoFedCumul;
    Double rrqCourant;
    Double rrqCumul;
    Double assuranceEmploiCourant;
    Double assuranceEmploiCumul;
    Double impotProvCourant;
    Double impotProvCumul;
    Double rqapCourant;
    Double rqapCumul;
}
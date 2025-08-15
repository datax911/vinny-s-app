package ca.vrg_online.app.dtos;

import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link ca.vrg_online.app.entities.TalonDePaye}
 */
@Value
public class TalonDePayeDto implements Serializable {
    Long id;
    String nomDuFichier;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    Date dateDePaiement;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    Date periodeDateDebut;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    Date periodeDatefin;

    Double salaireRegulierHeures;
    Double vacancesHrs;
    Double vacancesMontant;
    Double surtemps15Hrs;
    Double surtemps15Courant;
    Double surtemps20Hrs;
    Double surtemps20Courant;
    Double congeFlottantMontant;
    Double congeFerie;
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
    Double investDirectActionCumul;
    Double actionCorrespnetCumul;
    Double partagerMtchTrueupCumul;
    Double reerSurBonusCumul;
    Double reerAllRetraiteCumul;
    Double clubSocialCourant;
    Double clubSocialCumul;
    Double eeDmaBaseCourant;
    Double eeDmaBaseCumul;
    Double eeVieBaseCourant;
    Double eeVieBaseCumul;
    Double eeReerCourant;
    Double eeReerCumul;
    Double aiSeDmaBaseCourant;
    Double aiSeDmaBaseCumul;
    Double aiSeVieBaseCourant;
    Double aiSeVieBaseCumul;
    Double aiSeMedicamentCourant;
    Double aiSeMedicamentCumul;
    Double aiSeDentaireCourant;
    Double aiSeDentaireCumul;
    Double aiSeMedicalCourant;
    Double aiSeMedicalCumul;
    Double aiSeFlexReerCumul;
    Double aiFtqCourant;
    Double aiFtqCumul;
    Double erMatchCeliCourant;
    Double erMatchCeliCumul;
    Double seDcppCourant;
    Double seDcppCumul;
    Double salaireBrutCourant;
    Double salaireBrutCumul;
    Double deductionStatCourant;
    Double deductionStatCumul;
    Double autresDedCourant;
    Double autresDedCumul;
    Double reclamationCourant;
    Double reclamationCumul;
    Double paimentsNetsCourant;
    Double paimentsNetsCumul;
    Double paieNetCourant;
    Double paieNetCumul;
    Double virementBancaire;
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
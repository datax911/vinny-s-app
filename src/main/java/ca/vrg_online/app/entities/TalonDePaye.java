package ca.vrg_online.app.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "talon_de_paye")
public class TalonDePaye {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_de_paiement", nullable = false)
    private Date dateDePaiement;

    @Temporal(TemporalType.DATE)
    @Column(name = "periode_date_debut", nullable = false)
    private Date periodeDateDebut;

    @Temporal(TemporalType.DATE)
    @Column(name = "periode_date_fin", nullable = false)
    private Date periodeDatefin;


    // ---------- Gain -------- //

    // --- Salaire Régulier
    @Column(name = "salaire_regulier_heures", nullable = false)
    private Double salaireRegulierHeures;

    @Column(name = "salaire_regulier_montant", nullable = false)
    private Double salaireRegulierMontant;

    @Column(name = "salaire_regulier_cumul", nullable = false)
    private Double salaireRegulierCumul;


    // --- Vacances
    @Column(name = "vacances_hrs_cumul", nullable = false)
    private Double vacancesHrsCumul;

    @Column(name = "vacances_cumul", nullable = false)
    private Double vacancesCumul;


    // --- Surtemps 1.5
    @Column(name = "surtemps15_hrs_cumul", nullable = false)
    private Double surtemps15HrsCumul;

    @Column(name = "surtemps15_cumul", nullable = false)
    private Double surtemps15Cumul;


    // --- Surtemps 2.0
    @Column(name = "surtemps20_hrs_cumul", nullable = false)
    private Double surtemps20HrsCumul;

    @Column(name = "surtemps20_cumul", nullable = false)
    private Double surtemps20Cumul;

    // --- Congés flottants
    @Column(name = "conge_flottant_hrs_cumul", nullable = false)
    private Double congeFlottantHrsCumul;

    @Column(name = "conge_flottant_cumul", nullable = false)
    private Double congeFlottantCumul;

    // --- Congés fériés
    @Column(name = "conge_ferie_hrs_cumul", nullable = false)
    private Double congeFerieHrsCumul;

    @Column(name = "conge_ferie_cumul", nullable = false)
    private Double congeFerieCumul;


    // --- Boni Annuel
    @Column(name = "boni_hrs_cumul", nullable = false)
    private Double boniHrsCumul;

    @Column(name = "boni_cumul", nullable = false)
    private Double boniCumul;


    // --- Action Correspondant
    @Column(name = "action_hrs_cumul", nullable = false)
    private Double actionHrsCumul;

    @Column(name = "action_cumul", nullable = false)
    private Double actionCumul;


    // --- Impot fédéral
    @Column(name = "impot_fed_courant", nullable = false)
    private Double impotFedCourant;

    @Column(name = "import_fed_cumul", nullable = false)
    private Double impoFedCumul;


    // --- RRQ
    @Column(name = "rrq_courant", nullable = false)
    private Double rrqCourant;

    @Column(name = "rrq_cumul", nullable = false)
    private Double rrqCumul;


    // --- Assurance Emploi
    @Column(name = "assurance_emploi_courant", nullable = false)
    private Double assuranceEmploiCourant;

    @Column(name = "assurance_emploi_cumul", nullable = false)
    private Double assuranceEmploiCumul;


    // --- Impot Provinciale
    @Column(name = "impot_prov_courant", nullable = false)
    private Double impotProvCourant;

    @Column(name = "impot_prov_cumul", nullable = false)
    private Double impotProvCumul;


    // --- RQAP
    @Column(name = "rqap_courant", nullable = false)
    private Double rqapCourant;

    @Column(name = "rqap_cumul", nullable = false)
    private Double rqapCumul;

}
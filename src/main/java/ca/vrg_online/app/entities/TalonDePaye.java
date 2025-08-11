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

    @Column(name = "nom_du_fichier", nullable = false, unique = true, length = 1024)
    private String nomDuFichier;

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









    // ---------- Déduction statuaires -------- //


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









    // ---------- Autres déductions -------- //


    @Column(name = "invest_direct_action_cumul", nullable = false)
    private Double investDirectActionCumul;

    @Column(name = "action_correspnet_cumul", nullable = false)
    private Double actionCorrespnetCumul;

    @Column(name = "partager_mtch_trueup_cumul", nullable = false)
    private Double partagerMtchTrueupCumul;

    @Column(name = "reer_sur_bonus_cumul", nullable = false)
    private Double reerSurBonusCumul;

    @Column(name = "reer_all_retraite_cumul", nullable = false)
    private Double reerAllRetraiteCumul;



    @Column(name = "club_social_courant", nullable = false)
    private Double clubSocialCourant;

    @Column(name = "club_social_cumul", nullable = false)
    private Double clubSocialCumul;



    @Column(name = "ee_dma_base_courant", nullable = false)
    private Double eeDmaBaseCourant;

    @Column(name = "ee_dma_base_cumul", nullable = false)
    private Double eeDmaBaseCumul;



    @Column(name = "ee_vie_base_courant", nullable = false)
    private Double eeVieBaseCourant;

    @Column(name = "ee_vie_base_cumul", nullable = false)
    private Double eeVieBaseCumul;



    @Column(name = "ee_reer_courant", nullable = false)
    private Double eeReerCourant;

    @Column(name = "ee_reer_cumul", nullable = false)
    private Double eeReerCumul;




    // ---------- Info bénéfices -------- //


    @Column(name = "ai_se_dma_base_courant", nullable = false)
    private Double aiSeDmaBaseCourant;

    @Column(name = "ai_se_dma_base_cumul", nullable = false)
    private Double aiSeDmaBaseCumul;

    @Column(name = "ai_se_vie_base_courant", nullable = false)
    private Double aiSeVieBaseCourant;

    @Column(name = "ai_se_vie_base_cumul", nullable = false)
    private Double aiSeVieBaseCumul;

    @Column(name = "ai_se_medicament_courant", nullable = false)
    private Double aiSeMedicamentCourant;

    @Column(name = "ai_se_medicament_cumul", nullable = false)
    private Double aiSeMedicamentCumul;

    @Column(name = "ai_se_dentaire_courant", nullable = false)
    private Double aiSeDentaireCourant;

    @Column(name = "ai_se_dentaire_cumul", nullable = false)
    private Double aiSeDentaireCumul;

    @Column(name = "ai_se_medical_courant", nullable = false)
    private Double aiSeMedicalCourant;

    @Column(name = "ai_se_medical_cumul", nullable = false)
    private Double aiSeMedicalCumul;

    @Column(name = "ai_se_flex_reer_cumul", nullable = false)
    private Double aiSeFlexReerCumul;

    @Column(name = "ai_ftq_courant", nullable = false)
    private Double aiFtqCourant;

    @Column(name = "ai_ftq_cumul", nullable = false)
    private Double aiFtqCumul;

    @Column(name = "er_match_celi_courant", nullable = false)
    private Double erMatchCeliCourant;

    @Column(name = "er_match_celi_cumul", nullable = false)
    private Double erMatchCeliCumul;

    @Column(name = "se_dcpp_courant", nullable = false)
    private Double seDcppCourant;

    @Column(name = "se_dcpp_cumul", nullable = false)
    private Double seDcppCumul;




    // ---------- Sommaire -------- //


    @Column(name = "salaire_brut_courant", nullable = false)
    private Double salaireBrutCourant;

    @Column(name = "salaire_brut_cumul", nullable = false)
    private Double salaireBrutCumul;

    @Column(name = "deduction_stat_courant", nullable = false)
    private Double deductionStatCourant;

    @Column(name = "deduction_stat_cumul", nullable = false)
    private Double deductionStatCumul;

    @Column(name = "autres_ded_courant", nullable = false)
    private Double autresDedCourant;

    @Column(name = "autres_ded_cumul", nullable = false)
    private Double autresDedCumul;

    @Column(name = "reclamation_courant", nullable = false)
    private Double reclamationCourant;

    @Column(name = "reclamation_cumul", nullable = false)
    private Double reclamationCumul;

    @Column(name = "paiments_nets_courant", nullable = false)
    private Double paimentsNetsCourant;

    @Column(name = "paiments_nets_cumul", nullable = false)
    private Double paimentsNetsCumul;

    @Column(name = "paie_net_courant", nullable = false)
    private Double paieNetCourant;

    @Column(name = "paie_net_cumul", nullable = false)
    private Double paieNetCumul;

    @Column(name = "virement_bancaire", nullable = false)
    private Double virementBancaire;

}
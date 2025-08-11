ALTER TABLE talon_de_paye
    ADD action_correspnet_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ai_ftq_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ai_ftq_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ai_se_dentaire_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ai_se_dentaire_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ai_se_dma_base_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ai_se_dma_base_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ai_se_flex_reer_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ai_se_medical_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ai_se_medical_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ai_se_medicament_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ai_se_medicament_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ai_se_vie_base_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ai_se_vie_base_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD autres_ded_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD autres_ded_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD club_social_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD club_social_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD deduction_stat_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD deduction_stat_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ee_dma_base_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ee_dma_base_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ee_reer_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ee_reer_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ee_vie_base_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD ee_vie_base_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD er_match_celi_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD er_match_celi_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD invest_direct_action_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD paie_net_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD paie_net_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD paiments_nets_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD paiments_nets_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD partager_mtch_trueup_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD reclamation_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD reclamation_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD reer_all_retraite_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD reer_sur_bonus_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD salaire_brut_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD salaire_brut_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD se_dcpp_courant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD se_dcpp_cumul DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD virement_bancaire DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ALTER COLUMN action_correspnet_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ai_ftq_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ai_ftq_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ai_se_dentaire_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ai_se_dentaire_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ai_se_dma_base_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ai_se_dma_base_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ai_se_flex_reer_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ai_se_medical_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ai_se_medical_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ai_se_medicament_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ai_se_medicament_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ai_se_vie_base_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ai_se_vie_base_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN autres_ded_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN autres_ded_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN club_social_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN club_social_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN deduction_stat_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN deduction_stat_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ee_dma_base_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ee_dma_base_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ee_reer_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ee_reer_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ee_vie_base_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN ee_vie_base_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN er_match_celi_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN er_match_celi_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN invest_direct_action_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN paie_net_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN paie_net_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN paiments_nets_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN paiments_nets_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN partager_mtch_trueup_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN reclamation_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN reclamation_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN reer_all_retraite_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN reer_sur_bonus_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN salaire_brut_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN salaire_brut_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN se_dcpp_courant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN se_dcpp_cumul SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN virement_bancaire SET NOT NULL;
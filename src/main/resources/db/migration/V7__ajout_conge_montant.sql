ALTER TABLE talon_de_paye
    ADD conge_ferie_montant DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD conge_flottant_montant DOUBLE PRECISION;


UPDATE talon_de_paye SET conge_ferie_montant = 0.0;
UPDATE talon_de_paye SET conge_flottant_montant = 0.0;

ALTER TABLE talon_de_paye
    ALTER COLUMN conge_ferie_montant SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN conge_flottant_montant SET NOT NULL;
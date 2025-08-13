ALTER TABLE talon_de_paye
    ADD vacances_hrs DOUBLE PRECISION;

ALTER TABLE talon_de_paye
    ADD vacances_montant DOUBLE PRECISION;

UPDATE talon_de_paye SET vacances_hrs = 0.0;
UPDATE talon_de_paye SET vacances_montant = 0.0;


ALTER TABLE talon_de_paye
    ALTER COLUMN vacances_hrs SET NOT NULL;

ALTER TABLE talon_de_paye
    ALTER COLUMN vacances_montant SET NOT NULL;
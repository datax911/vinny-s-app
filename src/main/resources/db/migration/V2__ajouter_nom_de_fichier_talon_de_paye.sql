ALTER TABLE talon_de_paye
    ADD nom_du_fichier VARCHAR(1024);

ALTER TABLE talon_de_paye
    ALTER COLUMN nom_du_fichier SET NOT NULL;

ALTER TABLE talon_de_paye
    ADD CONSTRAINT uc_talon_de_paye_nom_du_fichier UNIQUE (nom_du_fichier);
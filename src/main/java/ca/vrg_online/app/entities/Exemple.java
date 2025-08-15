package ca.vrg_online.app.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "exemple")
public class Exemple {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank(message = "Ne doit pas être blank")
    @NotEmpty(message = "Ne doit pas être vide")
    @NotNull(message = "Ne doit pas être null")
    @Column(name = "commentaire", nullable = false, length = 2048)
    private String commentaire;

    @Positive(message = "Hey ça doit être positif!")
    @Column(name = "my_number")
    private Integer myNumber;

}
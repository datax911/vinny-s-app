package ca.vrg_online.app.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.io.Serializable;

/**
 * DTO for {@link ca.vrg_online.app.entities.Exemple}
 */
@Data
public class ExempleDto implements Serializable {
    private Long id;
    @NotNull(message = "Ne doit pas être null")
    @NotEmpty(message = "Ne doit pas être vide")
    @NotBlank(message = "Ne doit pas être blank")
    private String commentaire;
    @Positive(message = "Hey ça doit être positif!")
    private Integer myNumber;
}
package ca.vrg_online.app.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link ca.vrg_online.app.entities.Exemple}
 */
@Data @NoArgsConstructor
@AllArgsConstructor
public class ExempleDto implements Serializable {
    // Groupes
    public interface Create {}
    public interface Update {}

    @Null(groups = Create.class) @NotNull(groups = Update.class)
    private Long id;
    private String commentaire;
    private Integer myNumber;
}


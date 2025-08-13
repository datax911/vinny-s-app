package ca.vrg_online.app.entities;

import jakarta.persistence.*;
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

    @Column(name = "commentaire", nullable = false, length = 2048)
    private String commentaire;

    @Column(name = "my_number")
    private Integer myNumber;

}
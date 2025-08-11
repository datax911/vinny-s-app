package ca.vrg_online.app.repositories;

import ca.vrg_online.app.entities.TalonDePaye;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TalonDePayeRepository extends JpaRepository<TalonDePaye, Long> {
}
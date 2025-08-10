package ca.vrg_online.app.repositories;

import ca.vrg_online.app.entities.TalonDePaye;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TalonDePayeRepository extends Repository<TalonDePaye, Long> {
    @Query("select t from TalonDePaye t")
    List<TalonDePaye> findAll();
}
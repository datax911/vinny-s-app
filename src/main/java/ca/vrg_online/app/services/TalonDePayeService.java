package ca.vrg_online.app.services;

import ca.vrg_online.app.dto.TalonDePayeDto;
import ca.vrg_online.app.entities.TalonDePaye;
import ca.vrg_online.app.mappers.TalonDePayeMapper;
import ca.vrg_online.app.repositories.TalonDePayeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TalonDePayeService {


    private final TalonDePayeRepository talonDePayeRepository;
    private final TalonDePayeMapper talonDePayeMapper;

    public TalonDePayeService(TalonDePayeRepository talonDePayeRepository,
                              TalonDePayeMapper talonDePayeMapper) {
        this.talonDePayeRepository = talonDePayeRepository;
        this.talonDePayeMapper = talonDePayeMapper;
    }

    public List<TalonDePayeDto> findAll(){

        List<TalonDePaye> talonDePayeEntities = talonDePayeRepository.findAll();
        return talonDePayeEntities.stream().map(talonDePayeMapper::toDto).collect(Collectors.toList());
    }
}

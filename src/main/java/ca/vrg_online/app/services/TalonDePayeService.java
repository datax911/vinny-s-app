package ca.vrg_online.app.services;

import ca.vrg_online.app.TalonDePayeRepository;
import ca.vrg_online.app.dto.TalonDePayeDto;
import ca.vrg_online.app.entities.TalonDePaye;
import ca.vrg_online.app.mappers.TalonDePayeMapper;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TalonDePayeService {



    private final TalonDePayeMapper talonDePayeMapper;
    private final TalonDePayeRepository talonDePayeRepository;

    public TalonDePayeService(
            TalonDePayeMapper talonDePayeMapper, TalonDePayeRepository talonDePayeRepository) {

        this.talonDePayeMapper = talonDePayeMapper;
        this.talonDePayeRepository = talonDePayeRepository;
    }

    public List<TalonDePayeDto> findAll(){

        List<TalonDePaye> talonDePayeEntities = talonDePayeRepository.findAll();
        return talonDePayeEntities.stream().map(talonDePayeMapper::toDto).collect(Collectors.toList());
    }

    public TalonDePayeDto save(TalonDePayeDto talonDePayeDto) {

        TalonDePaye talonDePaye = talonDePayeMapper.toEntity(talonDePayeDto);
        talonDePayeRepository.save(talonDePaye);
        return talonDePayeMapper.toDto(talonDePaye);

    }
}

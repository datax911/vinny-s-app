package ca.vrg_online.app.services;

import ca.vrg_online.app.dtos.ExempleDto;
import ca.vrg_online.app.entities.Exemple;
import ca.vrg_online.app.entities.ExempleRepository;
import ca.vrg_online.app.exceptions.ExempleNotFoundException;
import ca.vrg_online.app.mappers.ExempleMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ExempleService {


    private final ExempleMapper exempleMapper;
    private final ExempleRepository exempleRepository;


    public ExempleService(ExempleMapper exempleMapper, ExempleRepository exempleRepository) {
        this.exempleMapper = exempleMapper;
        this.exempleRepository = exempleRepository;
    }


    // ----------------- READ ------------------ //
    public ExempleDto findById(long id) {
        //log.info("----------------------> Reading: Exemple id {}", id);
        return exempleMapper.toDto(exempleRepository.findById(id).orElseThrow(() -> new ExempleNotFoundException(id)));
    }

    public List<ExempleDto> findAll() {
        List<Exemple> exempleEntities = exempleRepository.findAll();
        return exempleEntities.stream().map(exempleMapper::toDto).collect(Collectors.toList());
    }
    // ----------------------------------------- //





    // ----------------- CREATE / UPDATE ------------------ //
    public ExempleDto save(ExempleDto exempleDto) {
        return exempleMapper.toDto(exempleRepository.save(exempleMapper.toEntity(exempleDto)));
    }





    // ----------------- DELETE ------------------ //
    public void deleteById(long id) {
        exempleRepository.deleteById(id);
    }


}

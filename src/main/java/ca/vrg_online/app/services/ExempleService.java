package ca.vrg_online.app.services;

import ca.vrg_online.app.dtos.ExempleDto;
import ca.vrg_online.app.entities.Exemple;
import ca.vrg_online.app.entities.ExempleRepository;
import ca.vrg_online.app.mappers.ExempleMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        return exempleMapper.toDto(exempleRepository.findById(id).orElse(null));
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

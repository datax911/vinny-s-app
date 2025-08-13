package ca.vrg_online.app.mappers;

import ca.vrg_online.app.dto.ExempleDto;
import ca.vrg_online.app.entities.Exemple;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ExempleMapper {
    Exemple toEntity(ExempleDto exempleDto);

    ExempleDto toDto(Exemple exemple);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Exemple partialUpdate(ExempleDto exempleDto, @MappingTarget Exemple exemple);
}
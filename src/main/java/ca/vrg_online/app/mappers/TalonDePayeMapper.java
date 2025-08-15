package ca.vrg_online.app.mappers;

import ca.vrg_online.app.dtos.TalonDePayeDto;
import ca.vrg_online.app.entities.TalonDePaye;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TalonDePayeMapper {
    TalonDePaye toEntity(TalonDePayeDto talonDePayeDto);

    TalonDePayeDto toDto(TalonDePaye talonDePaye);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TalonDePaye partialUpdate(TalonDePayeDto talonDePayeDto, @MappingTarget TalonDePaye talonDePaye);
}
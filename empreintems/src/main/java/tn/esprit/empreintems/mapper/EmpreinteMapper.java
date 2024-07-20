package tn.esprit.empreintems.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tn.esprit.empreintems.dto.EmpreinteDTO;
import tn.esprit.empreintems.entity.Empreinte;

@Mapper
public interface EmpreinteMapper {
    EmpreinteMapper INSTANCE = Mappers.getMapper(EmpreinteMapper.class);

    EmpreinteDTO toDTO(Empreinte empreinte);

    Empreinte toEntity(EmpreinteDTO empreinteDTO);
}


package tn.esprit.livrems.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tn.esprit.livrems.dto.LivreDTO;
import tn.esprit.livrems.entity.Livre;

@Mapper
public interface LivreMapper {
    LivreMapper INSTANCE = Mappers.getMapper(LivreMapper.class);

    LivreDTO toDTO(Livre livre);
    Livre toEntity(LivreDTO livreDTO);
}


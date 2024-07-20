package tn.esprit.empreintems.mapper;

import javax.annotation.processing.Generated;
import tn.esprit.empreintems.dto.EmpreinteDTO;
import tn.esprit.empreintems.entity.Empreinte;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-20T03:31:47+0100",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
public class EmpreinteMapperImpl implements EmpreinteMapper {

    @Override
    public EmpreinteDTO toDTO(Empreinte empreinte) {
        if ( empreinte == null ) {
            return null;
        }

        EmpreinteDTO empreinteDTO = new EmpreinteDTO();

        empreinteDTO.setId( empreinte.getId() );
        empreinteDTO.setLivreId( empreinte.getLivreId() );
        empreinteDTO.setDateEmpreinte( empreinte.getDateEmpreinte() );
        empreinteDTO.setDateRetour( empreinte.getDateRetour() );

        return empreinteDTO;
    }

    @Override
    public Empreinte toEntity(EmpreinteDTO empreinteDTO) {
        if ( empreinteDTO == null ) {
            return null;
        }

        Empreinte empreinte = new Empreinte();

        empreinte.setId( empreinteDTO.getId() );
        empreinte.setLivreId( empreinteDTO.getLivreId() );
        empreinte.setDateEmpreinte( empreinteDTO.getDateEmpreinte() );
        empreinte.setDateRetour( empreinteDTO.getDateRetour() );

        return empreinte;
    }
}

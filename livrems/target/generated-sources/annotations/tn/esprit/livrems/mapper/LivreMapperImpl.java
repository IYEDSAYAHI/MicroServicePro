package tn.esprit.livrems.mapper;

import javax.annotation.processing.Generated;
import tn.esprit.livrems.dto.LivreDTO;
import tn.esprit.livrems.entity.Livre;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-20T03:39:13+0100",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
public class LivreMapperImpl implements LivreMapper {

    @Override
    public LivreDTO toDTO(Livre livre) {
        if ( livre == null ) {
            return null;
        }

        LivreDTO livreDTO = new LivreDTO();

        livreDTO.setId( livre.getId() );
        livreDTO.setTitre( livre.getTitre() );
        livreDTO.setAuteur( livre.getAuteur() );
        livreDTO.setIsbn( livre.getIsbn() );

        return livreDTO;
    }

    @Override
    public Livre toEntity(LivreDTO livreDTO) {
        if ( livreDTO == null ) {
            return null;
        }

        Livre livre = new Livre();

        livre.setId( livreDTO.getId() );
        livre.setTitre( livreDTO.getTitre() );
        livre.setAuteur( livreDTO.getAuteur() );
        livre.setIsbn( livreDTO.getIsbn() );

        return livre;
    }
}

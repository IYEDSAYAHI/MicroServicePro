package tn.esprit.livrems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.livrems.dto.LivreDTO;
import tn.esprit.livrems.entity.Livre;
import tn.esprit.livrems.mapper.LivreMapper;
import tn.esprit.livrems.repository.LivreRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivreServiceImpl implements LivreService {

    @Autowired
    private LivreRepository livreRepository;

    @Override
    public List<LivreDTO> getAllLivres() {
        return livreRepository.findAll().stream()
                .map(LivreMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public LivreDTO getLivreById(Long id) {
        return livreRepository.findById(id)
                .map(LivreMapper.INSTANCE::toDTO)
                .orElseThrow(() -> new RuntimeException("Livre not found"));
    }

    @Override
    public LivreDTO createLivre(LivreDTO livreDTO) {
        Livre livre = LivreMapper.INSTANCE.toEntity(livreDTO);
        livre = livreRepository.save(livre);
        return LivreMapper.INSTANCE.toDTO(livre);
    }

    @Override
    public LivreDTO updateLivre(Long id, LivreDTO livreDTO) {
        Livre livre = LivreMapper.INSTANCE.toEntity(livreDTO);
        livre.setId(id);
        livre = livreRepository.save(livre);
        return LivreMapper.INSTANCE.toDTO(livre);
    }

    @Override
    public void deleteLivre(Long id) {
        livreRepository.deleteById(id);
    }
}


package tn.esprit.empreintems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.empreintems.dto.EmpreinteDTO;
import tn.esprit.empreintems.entity.Empreinte;
import tn.esprit.empreintems.mapper.EmpreinteMapper;
import tn.esprit.empreintems.repository.EmpreinteRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpreinteServiceImpl implements EmpreinteService {

    @Autowired
    private EmpreinteRepository empreinteRepository;

    @Override
    public List<EmpreinteDTO> getAllEmpreintes() {
        return empreinteRepository.findAll().stream()
                .map(EmpreinteMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EmpreinteDTO getEmpreinteById(String id) {
        return empreinteRepository.findById(id)
                .map(EmpreinteMapper.INSTANCE::toDTO)
                .orElseThrow(() -> new RuntimeException("Empreinte not found"));
    }

    @Override
    public EmpreinteDTO createEmpreinte(EmpreinteDTO empreinteDTO) {
        Empreinte empreinte = EmpreinteMapper.INSTANCE.toEntity(empreinteDTO);
        empreinte = empreinteRepository.save(empreinte);
        return EmpreinteMapper.INSTANCE.toDTO(empreinte);
    }

    @Override
    public void deleteEmpreinte(String id) {
        empreinteRepository.deleteById(id);
    }
}

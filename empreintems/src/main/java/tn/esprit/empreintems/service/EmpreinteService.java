package tn.esprit.empreintems.service;
import tn.esprit.empreintems.dto.EmpreinteDTO;

import java.util.List;

public interface EmpreinteService {
    List<EmpreinteDTO> getAllEmpreintes();
    EmpreinteDTO getEmpreinteById(String id);
    EmpreinteDTO createEmpreinte(EmpreinteDTO empreinteDTO);
    void deleteEmpreinte(String id);
}

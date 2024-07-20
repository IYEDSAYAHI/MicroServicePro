package tn.esprit.empreintems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.empreintems.client.LivreClient;
import tn.esprit.empreintems.dto.EmpreinteDTO;
import tn.esprit.empreintems.dto.LivreDTO;
import tn.esprit.empreintems.entity.Empreinte;
import tn.esprit.empreintems.repository.EmpreinteRepository;
import tn.esprit.empreintems.service.EmpreinteService;

import java.util.List;

@RestController
@RequestMapping("/empreintes")
public class EmpreinteController {

    @Autowired
    private EmpreinteService empreinteService;

    @Autowired
    private EmpreinteRepository empreinteRepository;

    @Autowired
    private LivreClient livreClient;

    @GetMapping
    public List<EmpreinteDTO> getAllEmpreintes() {
        return empreinteService.getAllEmpreintes();
    }

    @GetMapping("/{id}")
    public EmpreinteDTO getEmpreinteById(@PathVariable String id) {
        return empreinteService.getEmpreinteById(id);
    }

    @PostMapping
    public Empreinte createEmpreinte(@RequestBody Empreinte empreinte) {
        LivreDTO livreDTO = livreClient.getLivreById(empreinte.getLivreId());
        if (livreDTO == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Livre non trouvé");
        }
        return empreinteRepository.save(empreinte);
    }


    @DeleteMapping("/{id}")
    public void deleteEmpreinte(@PathVariable String id) {
        empreinteService.deleteEmpreinte(id);
    }
}

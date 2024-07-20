package tn.esprit.livrems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.livrems.dto.LivreDTO;
import tn.esprit.livrems.service.LivreService;

import java.util.List;

@RestController
@RequestMapping("/livres")
public class LivreController {

    @Autowired
    private LivreService livreService;

    @GetMapping
    public List<LivreDTO> getAllLivres() {
        return livreService.getAllLivres();
    }

    @GetMapping("/{id}")
    public LivreDTO getLivreById(@PathVariable Long id) {
        return livreService.getLivreById(id);
    }

    @PostMapping
    public LivreDTO createLivre(@RequestBody LivreDTO livreDTO) {
        return livreService.createLivre(livreDTO);
    }

    @PutMapping("/{id}")
    public LivreDTO updateLivre(@PathVariable Long id, @RequestBody LivreDTO livreDTO) {
        return livreService.updateLivre(id, livreDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteLivre(@PathVariable Long id) {
        livreService.deleteLivre(id);
    }
}

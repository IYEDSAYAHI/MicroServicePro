package tn.esprit.empreintems.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.empreintems.dto.LivreDTO;


@FeignClient(name = "livrems", url = "http://localhost:8080")
public interface LivreClient {
    @GetMapping("/livres/{id}")
    LivreDTO getLivreById(@PathVariable("id") Long id);
}

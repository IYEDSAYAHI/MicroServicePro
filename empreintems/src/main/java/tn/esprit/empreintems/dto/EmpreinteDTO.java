package tn.esprit.empreintems.dto;

import java.util.Date;

public class EmpreinteDTO {
    private String id;
    private Long livreId;
    private Date dateEmpreinte;
    private Date dateRetour;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getLivreId() {
        return livreId;
    }

    public void setLivreId(Long livreId) {
        this.livreId = livreId;
    }

    public Date getDateEmpreinte() {
        return dateEmpreinte;
    }

    public void setDateEmpreinte(Date dateEmpreinte) {
        this.dateEmpreinte = dateEmpreinte;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }
}

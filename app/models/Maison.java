package models;

import play.db.jpa.JPA;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "maison")
public class Maison {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ville;
    private String quartier;
    private String type; // location, vente,
    private String prix;
    private String description;
    private String image;

    /**
     * Constructeur avec arguments
     * @param ville
     * @param quartier
     * @param type
     * @param prix
     * @param description
     * @param image
     */
    public Maison(String ville, String quartier, String type, String prix, String description, String image) {
        this.ville = ville;
        this.quartier = quartier;
        this.type = type;
        this.prix = prix;
        this.description = description;
        this.image = image;
    }

    /**
     * Tous les maison
     *
     * @return
     */
    public List<Maison> findList() {
        try {
            return JPA.em().createQuery("select maison From Maison maison").getResultList();
        } catch (Exception e) {
            return null;
        }
    }
    
    /**
     * Constructeur sans arguments
     */
    public Maison() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

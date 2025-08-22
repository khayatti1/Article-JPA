package ma.formation.jdbc.service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titre;

    private String contenu;

    public Article(Object o, String description, int quantite, double price) {}

    public Article(String titre, String contenu) {
        this.titre = titre;
        this.contenu = contenu;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getContenu() { return contenu; }
    public void setContenu(String contenu) { this.contenu = contenu; }
}

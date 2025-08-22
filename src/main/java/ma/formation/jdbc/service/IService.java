package ma.formation.jdbc.service;

import ma.formation.jdbc.service.model.Article;

import java.util.List;

public interface IService {
    List<Article> getAllArticles();

    void addArticle(Article article);

    void deleteArticle(Long id);

    Boolean checkAccount(String username, String password);
    List<Article> getAllArticle();
    Article getArticleById(Long id);
    void createArticle(Article article);
    void updateArticle(Article article);
    void deleteArticleById(Long id);
    List<Article> searchArticles(String description, Double minPrice, Double maxPrice);
}
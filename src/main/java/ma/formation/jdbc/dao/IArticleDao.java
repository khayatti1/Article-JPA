package ma.formation.jdbc.dao;

import java.util.List;
import ma.formation.jdbc.service.model.Article;

public interface IArticleDao {
    void add(Article article);

    List<Article> findAll();

    void delete(Long id);

    Article findById(Long id);
    void create(Article article);
    void update(Article article);
    void deleteById(Long id);
    List<Article> findByCriteria(String description, Double minPrice, Double maxPrice);
}
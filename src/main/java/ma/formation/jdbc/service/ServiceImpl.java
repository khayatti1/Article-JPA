package ma.formation.jdbc.service;

import ma.formation.jdbc.dao.ArticleDaoImplJPA;
import ma.formation.jdbc.dao.IArticleDao;
import ma.formation.jdbc.service.model.Article;
import java.util.List;

public class ServiceImpl implements IService {

    private IArticleDao articleDao = new ArticleDaoImplJPA();

    @Override
    public List<Article> getAllArticles() {
        return articleDao.findAll();
    }

    @Override
    public void addArticle(Article article) {
        articleDao.add(article);
    }

    @Override
    public void deleteArticle(Long id) {
        articleDao.delete(id);
    }

    @Override
    public Boolean checkAccount(String username, String password) {
        return null;
    }

    @Override
    public List<Article> getAllArticle() {
        return List.of();
    }

    @Override
    public Article getArticleById(Long id) {
        return articleDao.findById(id);
    }

    @Override
    public void createArticle(Article article) {

    }

    @Override
    public void updateArticle(Article article) {
        articleDao.update(article);
    }

    @Override
    public void deleteArticleById(Long id) {

    }

    @Override
    public List<Article> searchArticles(String description, Double minPrice, Double maxPrice) {
        return List.of();
    }
}

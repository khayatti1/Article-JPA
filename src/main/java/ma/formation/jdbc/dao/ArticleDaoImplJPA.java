package ma.formation.jdbc.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import ma.formation.jdbc.service.model.Article;

import java.util.List;

public class ArticleDaoImplJPA implements IArticleDao {

    @Override
    public void add(Article article) {
        EntityManager em = JpaUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(article);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Article> findAll() {
        EntityManager em = JpaUtil.getEntityManager();
        TypedQuery<Article> query = em.createQuery("SELECT a FROM Article a", Article.class);
        return query.getResultList();
    }

    @Override
    public void delete(Long id) {
        EntityManager em = JpaUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            Article article = em.find(Article.class, id);
            if (article != null) {
                em.remove(article);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public Article findById(Long id) {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            return em.find(Article.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public void create(Article article) {

    }

    @Override
    public void update(Article article) {
        EntityManager em = JpaUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(article);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Article> findByCriteria(String description, Double minPrice, Double maxPrice) {
        return List.of();
    }
}

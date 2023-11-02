package org.example.ProjetBlogTechno.core.service.impl;

import org.example.ProjetBlogTechno.core.dto.ArticleDTO;
import org.example.ProjetBlogTechno.core.dto.CommentDTO;
import org.example.ProjetBlogTechno.core.repository.entity.Article;
import org.example.ProjetBlogTechno.core.repository.ArticleImpl;
import org.example.ProjetBlogTechno.core.service.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.*;

@Service
public class ArticleService implements ArticleServiceImpl {
    private final ArticleImpl articleImpl;

    @Autowired
    public ArticleService( ArticleImpl articleImpl) {
        this.articleImpl = articleImpl;
    }

    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        final Article savedArticle = articleImpl.save(toEntity(articleDTO));
        return toDTO(savedArticle);
    }

    @Override
    public boolean deleteArticle(Long id) {
        Article existing= articleImpl.findById(id).orElse(null);
        if(null==existing){
            return false;
        }
        articleImpl.delete(existing);
        return true;
    }

    @Override
    public boolean deleteAllArticle() {
        articleImpl.deleteAll();
        return true;
    }

    @Override
    public boolean addCommentToArticle(Long id, CommentDTO commentDTO) {
        return false;
    }

    @Override
    public List<ArticleDTO> listArticles() {
        final  Stream<Article> articleStream= articleImpl.findAll().stream();
        return articleStream.map(this::toDTO).toList();
    }
    public ArticleDTO getArticleById(Long id) {
        final Article article= articleImpl.findById(id).orElse(null);
        return toDTO(article);
    }

  private ArticleDTO toDTO(Article entity){
        if(null==entity){
            return null;
        }
        ArticleDTO dto = new ArticleDTO();
      dto.setTitre(entity.getTitre());
      dto.setContenu(entity.getContenu());
        dto.setId(entity.getId());
        return dto;
    }

    private Article toEntity(ArticleDTO dto){
        if(null==dto){
            return null;
        }
        Article entity = new Article();
        entity.setTitre(dto.getTitre());
        entity.setContenu(dto.getContenu());
        return entity;
    }
}

package com.mokadem.blogtech.service.impl;

import com.mokadem.blogtech.controller.dto.*;
import com.mokadem.blogtech.repository.*;
import com.mokadem.blogtech.repository.entity.*;
import com.mokadem.blogtech.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;
import java.util.stream.*;

@Service
public class ArticleService implements IArticleService {

    private final IArticleRepository articleRepository;

    public ArticleService(@Autowired IArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        final Article savedArticle = articleRepository.save(toEntity(articleDTO));
        return toDTO(savedArticle);
    }

    @Override
    public boolean deleteArticle(Long id) {
        Article existing= articleRepository.findById(id).orElse(null);
        if(null==existing){
            return false;
        }
        articleRepository.delete(existing);
        return true;
    }

    @Override
    public boolean addCommentToArticle(Long id, CommentDTO commentDTO) {
        return false;
    }

    @Override
    public List<ArticleDTO> listArticles() {
        final  Stream<Article> articleStream= StreamSupport.stream(articleRepository.findAll().spliterator(),false);
        return articleStream.map(this::toDTO).toList();
    }

  private ArticleDTO toDTO(Article entity){
        if(null==entity){
            return null;
        }
        ArticleDTO dto = new ArticleDTO();
        dto.setTitre(entity.getTitre());
        dto.setId(entity.getId());
        return dto;
    }

    private Article toEntity(ArticleDTO dto){
        if(null==dto){
            return null;
        }
        Article entity = new Article();
        entity.setTitre(dto.getTitre());
        return entity;
    }
}

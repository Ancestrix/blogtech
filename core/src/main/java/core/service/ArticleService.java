package core.service;

import core.dto.*;
import core.entity.*;
import core.entity.Impl.*;
import core.service.impl.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;
import java.util.stream.*;

@Service
public class ArticleService implements ArticleServiceImpl {
    private final ArticleImpl article;

    public ArticleService(@Autowired ArticleImpl article) {
        this.article = article;
    }

    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        final Article savedArticle = article.save(toEntity(articleDTO));
        return toDTO(savedArticle);
    }

    @Override
    public boolean deleteArticle(Long id) {
        Article existing= article.findById(id).orElse(null);
        if(null==existing){
            return false;
        }
        article.delete(existing);
        return true;
    }

    @Override
    public boolean addCommentToArticle(Long id, CommentDTO commentDTO) {
        return false;
    }

    @Override
    public List<ArticleDTO> listArticles() {
        final  Stream<Article> articleStream= StreamSupport.stream(article.findAll().spliterator(),false);
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

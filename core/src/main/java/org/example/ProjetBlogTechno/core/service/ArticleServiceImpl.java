package org.example.ProjetBlogTechno.core.service;


import org.example.ProjetBlogTechno.core.dto.ArticleDTO;
import org.example.ProjetBlogTechno.core.dto.CommentDTO;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public interface ArticleServiceImpl {
    public ArticleDTO saveArticle(ArticleDTO articleDTO);

    public boolean deleteArticle(Long id);
    public boolean deleteAllArticle();

    public boolean addCommentToArticle(Long id, CommentDTO commentDTO);

    public List<ArticleDTO> listArticles();

    public ArticleDTO getArticleById(Long id);
}

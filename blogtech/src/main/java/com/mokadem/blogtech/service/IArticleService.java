package com.mokadem.blogtech.service;

import com.mokadem.blogtech.controller.dto.*;

import java.util.*;

public interface    IArticleService {
    public ArticleDTO saveArticle(ArticleDTO articleDTO);

    public boolean deleteArticle(Long id);

    public boolean addCommentToArticle(Long id, CommentDTO commentDTO);

    public List<ArticleDTO> listArticles();
}

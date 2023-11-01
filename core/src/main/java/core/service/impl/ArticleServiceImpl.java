package core.service.impl;


import core.dto.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public interface ArticleServiceImpl {
    public ArticleDTO saveArticle(ArticleDTO articleDTO);

    public boolean deleteArticle(Long id);

    public boolean addCommentToArticle(Long id, CommentDTO commentDTO);

    public List<ArticleDTO> listArticles();
}

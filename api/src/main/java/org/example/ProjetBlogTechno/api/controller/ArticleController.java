package org.example.ProjetBlogTechno.api.controller;


import org.example.ProjetBlogTechno.core.dto.ArticleDTO;
import org.example.ProjetBlogTechno.core.service.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController()
@RequestMapping("/articles")
public class ArticleController {


    private final ArticleServiceImpl articleService;

    public ArticleController(@Autowired ArticleServiceImpl articleService) {
        this.articleService = articleService;
    }

    @GetMapping()
    public List<ArticleDTO> getArticleDTOList(){
        return articleService.listArticles();
    }

    @PostMapping()
    public ArticleDTO saveArticleDTO(@RequestBody final ArticleDTO articleDTO){
        return articleService.saveArticle(articleDTO);
    }

    @DeleteMapping("/{id}")
    public boolean deleteArticleDTO(@RequestParam final Long id){
        return articleService.deleteArticle(id);
    }
}

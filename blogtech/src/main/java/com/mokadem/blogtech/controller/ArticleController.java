package com.mokadem.blogtech.controller;

import com.mokadem.blogtech.controller.dto.*;
import com.mokadem.blogtech.service.*;
import com.mokadem.blogtech.service.impl.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController()
@RequestMapping("/articles")
public class ArticleController {


    private final IArticleService articleService;

    public ArticleController(@Autowired IArticleService articleService) {
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

package org.example.ProjetBlogTechno.api.controller;


import org.example.ProjetBlogTechno.core.dto.ArticleDTO;
import org.example.ProjetBlogTechno.core.service.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.*;
import org.springframework.ui.*;
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
    public List<ArticleDTO> getArticleDTOList(ModelMap model){
        model.addAttribute("articlesList",articleService.listArticles());
        return articleService.listArticles();
    }
    @GetMapping("/{id}")
    public ArticleDTO getArticleDTOById(@PathVariable Long id,ModelMap model){
        model.addAttribute("articleById",articleService.listArticles());
        return articleService.getArticleById(id);
    }

    @PostMapping()
    public ArticleDTO saveArticleDTO(@RequestBody final ArticleDTO articleDTO){
        return articleService.saveArticle(articleDTO);
    }

    @DeleteMapping("/{id}")
    public boolean deleteArticleDTO(@RequestParam final Long id){
        return articleService.deleteArticle(id);
    }
    @DeleteMapping()
    public boolean deleteAllArticleDTO(){
        return articleService.deleteAllArticle();
    }
}

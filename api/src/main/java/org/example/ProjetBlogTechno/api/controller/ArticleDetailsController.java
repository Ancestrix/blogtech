package org.example.ProjetBlogTechno.api.controller;


import org.example.ProjetBlogTechno.core.dto.*;
import org.example.ProjetBlogTechno.core.service.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/article-detail")
public class ArticleDetailsController {


    private final ArticleServiceImpl articleService;

    public ArticleDetailsController(@Autowired ArticleServiceImpl articleService) {
        this.articleService = articleService;
    }
    @GetMapping("/{id}")
    public ArticleDTO getArticleDetails(@PathVariable Long id, Model model) {
        ArticleDTO articleDTO = articleService.getArticleById(id);

        if (articleDTO != null) {
            model.addAttribute("article", articleDTO);
            return articleDTO; // Assurez-vous que le nom de la vue (article-details) correspond à votre configuration.
        } else {
            // Gérez le cas où l'article n'est pas trouvé, par exemple, en redirigeant vers une page d'erreur.
            return null; // Adapter selon vos besoins.
        }
    }
}

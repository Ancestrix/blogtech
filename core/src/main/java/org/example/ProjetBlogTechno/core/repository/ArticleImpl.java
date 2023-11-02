package org.example.ProjetBlogTechno.core.repository;


import org.example.ProjetBlogTechno.core.repository.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ArticleImpl extends JpaRepository<Article,Long> {
}

package org.example.ProjetBlogTechno.core.repository.entity;

import java.util.Date;

public class Comment {
    private int id;
    private String content;
    private Date dateOfCreation;
    private User author;
    private Article article;

    public Comment(int id, String content, Date dateOfCreation, User author, Article article) {
        this.id = id;
        this.content = content;
        this.dateOfCreation = dateOfCreation;
        this.author = author;
        this.article = article;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                ", author=" + author +
                ", article=" + article +
                '}';
    }
}

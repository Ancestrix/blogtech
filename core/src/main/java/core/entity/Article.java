package core.entity;

import java.util.Date;
import java.util.List;

public class Article {

    private int id;
    private String title;
    private String content;
    private Date dateOfPublication;
    private User author;
    private List<Category> categories;

    public Article(int id, String title, String content, Date dateOfPublication, User user, List<Category> categories) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.dateOfPublication = dateOfPublication;
        this.author = user;
        this.categories = categories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(Date dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", dateOfPublication=" + dateOfPublication +
                ", user=" + author +
                ", categories=" + categories +
                '}';
    }

}

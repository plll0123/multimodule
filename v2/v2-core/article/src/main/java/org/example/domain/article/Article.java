package org.example.domain.article;

public class Article {

    private final Long id;
    private final Title title;

    public Article(final String title) {
        this.title = new Title(title);
        this.id = null;
    }
}

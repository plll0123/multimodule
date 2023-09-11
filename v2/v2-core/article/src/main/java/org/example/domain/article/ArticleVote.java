package org.example.domain.article;

import org.example.domain.avatar.Avatar;

public class ArticleVote {
    private final Article article;
    private final Avatar avatar;

    public ArticleVote(Article article, Avatar avatar) {
        this.article = article;
        this.avatar = avatar;
    }
}

package org.example.domain.article.port.out;

import org.example.domain.article.Article;

public interface ArticleRegisterGateWay {

    void save(final Article article);
}

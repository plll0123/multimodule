package org.example.domain.article;

import org.example.domain.DomainValueObject;

import java.util.regex.Pattern;

public class Title extends DomainValueObject {

    private final String title;
    private static final Pattern TITLE_PATTERN =
            Pattern.compile("^[가-힣]{2,5}$");

    public Title(final String title) {
        if (doesntMatch(TITLE_PATTERN, title))
            throw new IllegalArgumentException();
        this.title = title;
    }
}

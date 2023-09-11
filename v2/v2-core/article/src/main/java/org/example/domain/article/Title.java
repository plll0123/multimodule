package org.example.domain.article;

import java.util.regex.Pattern;

public class Title  {

    private final String title;
    private static final Pattern TITLE_PATTERN =
            Pattern.compile("^[가-힣]{2,5}$");

    public Title(final String title) {
        if (TITLE_PATTERN.matcher(title).matches())
            throw new IllegalArgumentException();
        this.title = title;
    }
}

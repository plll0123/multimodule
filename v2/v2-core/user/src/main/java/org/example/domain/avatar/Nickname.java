package org.example.domain.avatar;

import java.util.regex.Pattern;

public record Nickname(String nickname) {

    private static final Pattern LOGIN_ID_PATTERN = Pattern.compile("닉네임 패턴");

    public Nickname {
        if (LOGIN_ID_PATTERN.matcher(nickname).matches()) {
            throw new IllegalArgumentException();
        }
    }
}

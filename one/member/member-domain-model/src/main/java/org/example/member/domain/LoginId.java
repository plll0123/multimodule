package org.example.member.domain;

import org.example.member.exception.InvalidLoginIdFormatException;

import java.util.Optional;
import java.util.regex.Pattern;

record LoginId(String loginId) {

    private static final Pattern LOGIN_ID_PATTERN =
            Pattern.compile("^[0-9a-zA-z]{4,10}$");

    LoginId(final String loginId) {
        this.loginId = Optional.ofNullable(loginId)
                .filter(id -> LOGIN_ID_PATTERN.matcher(id).matches())
                .orElseThrow(() -> new InvalidLoginIdFormatException("아이디는 4 ~ 6 자의 숫자 혹은 알파벳으로 구성돼야 합니다."));
    }
}

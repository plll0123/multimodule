package org.example.domain.user.model.vo;

import org.example.domain.user.exception.PasswordDoesntMatchException;

import java.util.regex.Pattern;

public class Password {

    private final String password;
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("비밀번호 패턴");

    public Password(String password) {
        if (PASSWORD_PATTERN.matcher(password).matches()) {
            throw new PasswordDoesntMatchException("");
        }
        this.password = password;
    }

    public static Password of(String password) {
        return new Password(password);
    }

    public String password() {
        return password;
    }
}

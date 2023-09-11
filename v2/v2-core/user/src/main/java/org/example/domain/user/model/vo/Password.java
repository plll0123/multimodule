package org.example.domain.user.model.vo;

import org.example.domain.DomainValueObject;
import org.example.domain.user.exception.PasswordDoesntMatchException;

import java.util.regex.Pattern;

public class Password extends DomainValueObject {

    private final String password;
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("비밀번호 패턴");

    public Password(String password) {
        if (doesntMatch(PASSWORD_PATTERN, password))
            throw new PasswordDoesntMatchException("");
        this.password = password;
    }

    public String password() {
        return password;
    }
}

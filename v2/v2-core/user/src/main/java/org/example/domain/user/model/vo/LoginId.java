package org.example.domain.user.model.vo;

import org.example.domain.DomainValueObject;
import org.example.domain.user.exception.LoginIdDoesntMatchException;

import java.util.regex.Pattern;

public class LoginId extends DomainValueObject {

    private final String loginId;
    private static final Pattern LOGIN_ID_PATTERN = Pattern.compile("로그인 아이디 패턴");

    public LoginId(String loginId) {
        if (doesntMatch(LOGIN_ID_PATTERN, loginId))
            throw new LoginIdDoesntMatchException("");
        this.loginId = loginId;
    }

    public String loginId() {
        return loginId;
    }
}

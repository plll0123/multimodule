package org.example.domain.user.model.vo;

import org.example.domain.user.exception.LoginIdDoesntMatchException;

import java.util.regex.Pattern;

public class LoginId {

    private final String loginId;
    private static final Pattern LOGIN_ID_PATTERN = Pattern.compile("로그인 아이디 패턴");

    public LoginId(String loginId) {
        if (LOGIN_ID_PATTERN.matcher(loginId).matches()) {
            throw new LoginIdDoesntMatchException("");
        }
        this.loginId = loginId;
    }

    /**
     * 회원가입이 완료된 회원의 로그인 아이디를 불러오는 메서드
     */
    public static LoginId of(String loginId) {
        return new LoginId(loginId);
    }

    public String loginId() {
        return loginId;
    }
}

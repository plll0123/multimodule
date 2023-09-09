package org.example.domain.avatar.exception;

import org.example.BizException;

/**
 * 회원가입 시 닉네임이 맞지 않으면 발생하는 예외입니다.
 */
public class NicknamePatternNotMatchesException extends BizException {

    public NicknamePatternNotMatchesException(String message) {
        super(message);
    }
}

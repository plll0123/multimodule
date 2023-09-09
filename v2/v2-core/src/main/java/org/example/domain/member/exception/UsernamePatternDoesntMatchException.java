package org.example.domain.member.exception;

import org.example.exception.BizException;

/**
 * 회원가입 시 이름이 정해진 규칙에 맞지 않으면 발생하는 예외입니다.
 */
public class UsernamePatternDoesntMatchException extends BizException {

    public UsernamePatternDoesntMatchException(String message) {
        super(message);
    }
}

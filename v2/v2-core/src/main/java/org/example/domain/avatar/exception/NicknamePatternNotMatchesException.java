package org.example.domain.avatar.exception;

import org.example.BizException;

public class NicknamePatternNotMatchesException extends BizException {

    public NicknamePatternNotMatchesException(String message) {
        super(message);
    }
}

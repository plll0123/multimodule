package org.example.domain.user.exception;

import org.example.exception.BizException;

public class LoginIdDoesntMatchException extends BizException {
    public LoginIdDoesntMatchException(String cause) {
    }
}

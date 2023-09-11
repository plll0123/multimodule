package org.example.domain.user.port.login.in;

import org.example.domain.user.model.vo.LoginId;

public record UserLoginQuery(String loginId, String password) {

}

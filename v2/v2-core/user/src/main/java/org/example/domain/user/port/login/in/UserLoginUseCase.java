package org.example.domain.user.port.login.in;

import org.example.domain.user.model.vo.UserInfoToken;

public interface UserLoginUseCase {

    UserInfoToken login(UserLoginQuery loginQuery);
}

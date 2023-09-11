package org.example.domain.user.port.login.out;

import org.example.domain.user.model.User;
import org.example.domain.user.model.vo.LoginId;
import org.example.domain.user.port.login.in.UserLoginQuery;

import java.util.Optional;

public interface UserLoginPort {

    Optional<User> findByLoginId(final LoginId loginId);
}

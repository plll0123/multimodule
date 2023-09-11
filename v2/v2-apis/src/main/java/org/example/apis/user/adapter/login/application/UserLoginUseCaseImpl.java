package org.example.apis.user.adapter.login.application;

import org.example.apis.user.adapter.login.out.UserLoginAdapter;
import org.example.domain.user.model.vo.LoginId;
import org.example.domain.user.model.vo.Password;
import org.example.domain.user.port.login.in.UserLoginQuery;
import org.example.domain.user.port.login.in.UserLoginUseCase;
import org.example.domain.user.model.vo.UserInfoToken;
import org.example.domain.user.port.login.out.UserLoginPort;
import org.springframework.stereotype.Component;


@Component
public class UserLoginUseCaseImpl implements UserLoginUseCase {

    private final UserLoginPort loginAdapter;

    public UserLoginUseCaseImpl(UserLoginAdapter loginAdapter) {
        this.loginAdapter = loginAdapter;
    }

    @Override
    public UserInfoToken login(UserLoginQuery loginQuery) {
        return loginAdapter.findByLoginId(new LoginId(loginQuery.loginId()))
                .filter(findUser -> findUser.isMatchPassword(new Password(loginQuery.password())))
                .map(findUser -> new UserInfoToken(findUser.id(), findUser.loginId()))
                .orElseThrow(() -> new IllegalArgumentException("아이디 혹은 패스워드가 일치하지 않습니다."));
    }
}

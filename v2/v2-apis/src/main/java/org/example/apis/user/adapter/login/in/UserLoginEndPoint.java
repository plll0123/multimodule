package org.example.apis.user.adapter.login.in;

import org.example.domain.user.model.vo.UserInfoToken;
import org.example.domain.user.port.login.in.UserLoginQuery;
import org.example.domain.user.port.login.in.UserLoginUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginEndPoint {

    private final UserLoginUseCase loginUseCase;

    public UserLoginEndPoint(UserLoginUseCase loginUseCase) {
        this.loginUseCase = loginUseCase;
    }

    @GetMapping("/login")
    public ResponseEntity<UserInfoToken> login(UserLoginQuery loginQuery) {
        final UserInfoToken token = loginUseCase.login(loginQuery);
        return ResponseEntity.ok(token);
    }
}

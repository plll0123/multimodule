package org.example.apis.user.adapter.register.in;

import org.example.domain.user.model.vo.UserInfoToken;
import org.example.domain.user.port.login.in.UserLoginQuery;
import org.example.domain.user.port.register.in.UserRegisterCommand;
import org.example.domain.user.port.register.in.UserRegisterUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegisterEndPoint {

    private final UserRegisterUseCase registerUseCase;

    public UserRegisterEndPoint(UserRegisterUseCase userService) {
        this.registerUseCase = userService;
    }

    @GetMapping("/user")
    public void register(UserRegisterCommand userRegisterCommand) {
        System.out.println("userRegisterCommand = " + userRegisterCommand);
        registerUseCase.register(userRegisterCommand);
    }

}

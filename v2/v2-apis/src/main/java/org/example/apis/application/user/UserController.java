package org.example.apis.application.user;

import org.example.domain.member.port.in.UserRegisterCommand;
import org.example.domain.member.port.in.UserReigsterUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserReigsterUseCase userReigsterUseCase;

    public UserController(UserReigsterUseCase userReigsterUseCase) {
        this.userReigsterUseCase = userReigsterUseCase;
    }

    private int number = 0;
    @GetMapping("/user")
    public void useruser() {
        number++;
        String nickname = "엄준식";
        String username = "엄준식";
        userReigsterUseCase.register(new UserRegisterCommand(nickname, username));
    }
}

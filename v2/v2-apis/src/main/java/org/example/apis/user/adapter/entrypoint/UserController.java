package org.example.apis.user.adapter.entrypoint;

import org.example.apis.user.adapter.application.UserServiceFacade;
import org.example.domain.user.port.register.in.UserRegisterCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserServiceFacade userService;

    public UserController(UserServiceFacade userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public void useruser(UserRegisterCommand userRegisterCommand) {
        System.out.println("userRegisterCommand = " + userRegisterCommand);
        userService.register(userRegisterCommand);
    }
}

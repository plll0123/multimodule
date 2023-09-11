package org.example.apis.user.adapter.application;

import org.example.domain.user.port.register.in.UserRegisterCommand;
import org.example.domain.user.port.register.in.UserReigsterUseCase;
import org.springframework.stereotype.Service;

@Service
public class UserServiceFacade {

    private final UserReigsterUseCase userRegister;

    public UserServiceFacade(UserReigsterUseCase userRegister) {
        this.userRegister = userRegister;
    }

    public void register(UserRegisterCommand userRegisterCommand) {
        userRegister.register(userRegisterCommand);
    }
}

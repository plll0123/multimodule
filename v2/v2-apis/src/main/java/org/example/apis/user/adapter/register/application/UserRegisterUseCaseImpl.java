package org.example.apis.user.adapter.register.application;

import org.example.domain.user.port.register.in.UserRegisterCommand;
import org.example.domain.user.port.register.in.UserRegisterUseCase;
import org.example.domain.user.port.register.out.UserRegisterPort;
import org.springframework.stereotype.Component;

@Component
class UserRegisterUseCaseImpl implements UserRegisterUseCase {

    private final UserRegisterPort userRegisterPort;

    public UserRegisterUseCaseImpl(UserRegisterPort userRegisterGateWay) {
        this.userRegisterPort = userRegisterGateWay;
    }

    @Override
    public void register(UserRegisterCommand userRegisterCommand) {
        userRegisterPort.save(userRegisterCommand.toDomain());
    }
}

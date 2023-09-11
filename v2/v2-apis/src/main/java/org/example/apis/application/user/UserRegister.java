package org.example.apis.application.user;

import org.example.domain.member.port.in.UserRegisterCommand;
import org.example.domain.member.port.in.UserReigsterUseCase;
import org.example.domain.member.port.out.UserRegisterGateWay;
import org.springframework.stereotype.Component;

@Component
public class UserRegister implements UserReigsterUseCase {

    private final UserRegisterGateWay userRegisterGateWay;

    public UserRegister(UserRegisterGateWay userRegisterGateWay) {
        this.userRegisterGateWay = userRegisterGateWay;
    }

    @Override
    public void register(UserRegisterCommand userRegisterCommand) {
        userRegisterGateWay.save(userRegisterCommand.toDomain());
    }
}

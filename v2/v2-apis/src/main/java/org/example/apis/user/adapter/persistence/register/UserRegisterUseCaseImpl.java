package org.example.apis.user.adapter.persistence.register;

import org.example.domain.user.port.register.in.UserRegisterCommand;
import org.example.domain.user.port.register.in.UserReigsterUseCase;
import org.example.domain.user.port.register.out.UserRegisterGateWay;
import org.springframework.stereotype.Component;

@Component
class UserRegisterUseCaseImpl implements UserReigsterUseCase {

    private final UserRegisterGateWay userRegisterGateWay;

    public UserRegisterUseCaseImpl(UserRegisterGateWay userRegisterGateWay) {
        this.userRegisterGateWay = userRegisterGateWay;
    }

    @Override
    public void register(UserRegisterCommand userRegisterCommand) {
        userRegisterGateWay.save(userRegisterCommand.toDomain());
    }
}

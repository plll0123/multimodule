package org.example.domain.member.port.out;

import org.example.domain.member.port.in.UserRegisterCommand;

public interface UserRegisterGateWay {

    void register(UserRegisterCommand userRegisterCommand);
}

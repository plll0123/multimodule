package org.example.domain.user.port.register.in;

import org.example.domain.user.model.User;

public record UserRegisterCommand(String username, String nickname, String loginId, String password) {

    public User toDomain() {
        return new User(username, nickname, loginId, password);
    }
}

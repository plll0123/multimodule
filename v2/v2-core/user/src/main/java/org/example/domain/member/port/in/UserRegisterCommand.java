package org.example.domain.member.port.in;

import org.example.domain.member.User;

public record UserRegisterCommand(String nickname, String username) {

    public User toDomain() {
        return new User(nickname, username);
    }
}

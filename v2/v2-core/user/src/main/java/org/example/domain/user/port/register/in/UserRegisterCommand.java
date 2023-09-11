package org.example.domain.user.port.register.in;

import org.example.domain.avatar.Avatar;
import org.example.domain.avatar.Nickname;
import org.example.domain.user.model.User;
import org.example.domain.user.model.vo.LoginId;
import org.example.domain.user.model.vo.Name;
import org.example.domain.user.model.vo.Password;

public record UserRegisterCommand(String username, String nickname, String loginId, String password) {

    public User toDomain() {
        return new User(
                new Name(username), new Avatar(new Nickname(nickname)), new LoginId(loginId), new Password(password)
        );
    }
}

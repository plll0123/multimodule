package org.example.domain.user.model;

import org.example.domain.avatar.Avatar;
import org.example.domain.user.model.vo.LoginId;
import org.example.domain.user.model.vo.Name;
import org.example.domain.user.model.vo.Password;

public class User {
    private final Long id;
    private final Name name;
    private final LoginId loginId;
    private final Password password;
    private final Avatar avatar;

    public User(final String name, final String nickname, final String loginId, final String password) {
        this.name = new Name(name);
        this.avatar = new Avatar(nickname);
        this.loginId = new LoginId(loginId);
        this.password = new Password(password);
        this.id = null;
    }

    public Long id() {
        return id;
    }

    public String name() {
        return name.name();
    }

    public Avatar avatar() {
        return avatar;
    }

    public LoginId loginId() {
        return loginId;
    }

    public Password password() {
        return password;
    }
}

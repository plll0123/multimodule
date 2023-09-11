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

    public User(final Name name, final Avatar avatar, final LoginId loginId, final Password password) {
        this.name = name;
        this.avatar = avatar;
        this.loginId = loginId;
        this.password = password;
        this.id = null;
    }

    private User(final Long id, final String name, final String loginId, final String password, final Avatar avatar) {
        this.id = id;
        this.name = Name.of(name);
        this.loginId = LoginId.of(loginId);
        this.password = Password.of(password);
        this.avatar = avatar;
    }
    public static User of(final Long id, final String name, final String loginId, final String password, final Avatar avatar) {
        return new User(id, name, loginId, password, avatar);
    }

    public boolean isMatchPassword(final Password other) {
        return other.password().equalsIgnoreCase(this.password.password());
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

    public String loginId() {
        return loginId.loginId();
    }

    public String password() {
        return password.password();
    }

}

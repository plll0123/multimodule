package org.example.domain.member;

import org.example.domain.avatar.Avatar;

public class User {
    private final Long id;
    private final Name name;
    private final Avatar avatar;

    public User(final String username, final String nickname) {
        this.name = new Name(username);
        this.avatar = new Avatar(nickname);
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
}

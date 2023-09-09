package org.example.domain.member;

import org.example.domain.avatar.Avatar;

public class User {
    private final Long id;
    private final Name name;
    private final Avatar avatar;

    public User(String name, String nickname) {
        this.id = null;
        this.name = new Name(name);
        this.avatar = new Avatar(nickname);
    }
}

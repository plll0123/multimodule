package org.example.apis.avatar.adapter.persistence;

import jakarta.persistence.*;
import org.example.domain.avatar.Avatar;
import org.example.domain.avatar.Nickname;

@Entity
@Table(name = "avatar")
public class AvatarEntity {

    @Id
    @GeneratedValue
    @Column(name = "avatar_id")
    private Long id;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    protected AvatarEntity() {

    }

    public AvatarEntity(String nickname) {
        this.nickname = nickname;
    }

    public Avatar toDomain() {
        return Avatar.of(id, new Nickname(nickname));
    }
}

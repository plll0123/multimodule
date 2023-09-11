package org.example.apis.user.adapter.persistence;

import jakarta.persistence.*;
import org.example.apis.avatar.adapter.persistence.AvatarEntity;
import org.example.domain.user.model.User;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue
    @Column(name = "users_id")
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Cascade(CascadeType.PERSIST)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "avatar_id")
    private AvatarEntity avatar;

    protected UserEntity() {
    }

    public UserEntity(final User user) {
        this.username = user.name();
        this.avatar = new AvatarEntity(user.avatar().nickname());
    }
}

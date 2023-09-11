package org.example.user.entity;

import jakarta.persistence.*;
import jdk.jfr.MemoryAddress;
import org.example.avatar.entity.AvatarEntity;
import org.example.domain.avatar.Avatar;
import org.example.domain.member.User;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.management.DescriptorKey;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "avatar_id")
    @Cascade(CascadeType.ALL)
    private AvatarEntity avatar;

    protected UserEntity() {

    }

    public UserEntity(final User user) {
        this.name = user.name();
        this.avatar = new AvatarEntity(user.avatar().nickname());
    }

    public Long id() {
        return id;
    }

    public String name() {
        return name;
    }

    public AvatarEntity avatar() {
        return avatar;
    }
}

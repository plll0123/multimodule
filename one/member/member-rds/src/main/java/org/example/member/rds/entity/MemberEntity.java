package org.example.member.rds.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.member.domain.Member;

@Entity
@NoArgsConstructor
@Getter
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(name = "login_id", nullable = false, updatable = false, length = 10)
    private String loginId;

    public MemberEntity(String loginId) {
        this.loginId = loginId;
    }

    public MemberEntity(Long id, String loginId) {
        this.id = id;
        this.loginId = loginId;
    }

    public Member toDomain() {
        return new Member(this.id, this.loginId);
    }
}

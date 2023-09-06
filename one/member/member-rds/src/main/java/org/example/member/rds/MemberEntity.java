package org.example.member.rds;

import jakarta.persistence.*;

@Entity
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login_id", nullable = false, updatable = false, length = 10)
    private String loginId;
}

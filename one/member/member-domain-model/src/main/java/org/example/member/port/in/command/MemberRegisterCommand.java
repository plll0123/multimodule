package org.example.member.port.in.command;

import org.example.member.domain.Member;

public record MemberRegisterCommand(String loginId){

    public Member toDomain() {
        return new Member(loginId());
    }
}

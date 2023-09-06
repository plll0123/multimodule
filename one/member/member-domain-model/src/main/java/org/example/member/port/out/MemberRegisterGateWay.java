package org.example.member.port.out;

import org.example.member.domain.Member;

public interface MemberRegisterGateWay {

    void save(final Member member);
}

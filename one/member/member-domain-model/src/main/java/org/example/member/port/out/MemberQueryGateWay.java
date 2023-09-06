package org.example.member.port.out;

import org.example.member.domain.Member;

public interface MemberQueryGateWay {

    Member getById(final Long memberId);
}

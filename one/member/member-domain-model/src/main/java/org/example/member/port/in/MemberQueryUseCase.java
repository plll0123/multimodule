package org.example.member.port.in;

import org.example.member.domain.Member;

public interface MemberQueryUseCase {

    Member getMember(final Long memberId);
}

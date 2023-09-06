package org.example.member.application;

import lombok.RequiredArgsConstructor;
import org.example.member.domain.Member;
import org.example.member.port.in.MemberQueryUseCase;
import org.example.member.port.out.MemberQueryGateWay;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberQueryExecuter implements MemberQueryUseCase {

    private final MemberQueryGateWay memberQueryGateWay;

    @Override
    public Member getMember(Long memberId) {
        return memberQueryGateWay.getById(memberId);
    }
}

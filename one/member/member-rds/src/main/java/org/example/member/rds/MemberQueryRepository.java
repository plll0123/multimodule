package org.example.member.rds;

import lombok.RequiredArgsConstructor;
import org.example.member.domain.Member;
import org.example.member.port.out.MemberQueryGateWay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberQueryRepository implements MemberQueryGateWay {

    private final MemberRepository memberRepository;

    @Override
    public Member getById(Long memberId) {
        return memberRepository.findById(memberId)
                .orElseThrow()
                .toDomain();
    }
}

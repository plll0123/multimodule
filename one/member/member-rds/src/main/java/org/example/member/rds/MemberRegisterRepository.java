package org.example.member.rds;

import lombok.RequiredArgsConstructor;
import org.example.member.domain.Member;
import org.example.member.port.out.MemberRegisterGateWay;
import org.example.member.rds.entity.MemberEntity;
import org.springframework.stereotype.Component;

@Component
public class MemberRegisterRepository implements MemberRegisterGateWay {

    private final MemberRepository memberRepository;

    public MemberRegisterRepository(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void save(final Member member) {
        memberRepository.save(new MemberEntity(member.loginId()));
    }
}

package org.example.member.application;

import lombok.RequiredArgsConstructor;
import org.example.member.domain.Member;
import org.example.member.port.in.MemberRegisterUseCase;
import org.example.member.port.in.command.MemberRegisterCommand;
import org.example.member.port.out.MemberRegisterGateWay;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberRegisterExcuter implements MemberRegisterUseCase {

    private final MemberRegisterGateWay memberRegisterGateWay;

    @Override
    public void register(MemberRegisterCommand registerCommand) {
        final Member member = registerCommand.toDomain();
        memberRegisterGateWay.save(member);
    }
}

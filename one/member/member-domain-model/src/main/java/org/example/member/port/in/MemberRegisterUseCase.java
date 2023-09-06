package org.example.member.port.in;

import org.example.member.port.in.command.MemberRegisterCommand;

public interface MemberRegisterUseCase {

    void register(final MemberRegisterCommand registerCommand);
}

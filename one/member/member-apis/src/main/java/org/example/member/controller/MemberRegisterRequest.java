package org.example.member.controller;

import lombok.RequiredArgsConstructor;
import org.example.member.port.in.command.MemberRegisterCommand;

public record MemberRegisterRequest(String loginId) {
    MemberRegisterCommand convertCommand() {
        return new MemberRegisterCommand(loginId());
    }
}

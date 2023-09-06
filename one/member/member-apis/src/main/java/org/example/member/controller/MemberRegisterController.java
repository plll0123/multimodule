package org.example.member.controller;

import lombok.RequiredArgsConstructor;
import org.example.member.domain.Member;
import org.example.member.port.in.MemberRegisterUseCase;
import org.example.member.port.in.command.MemberRegisterCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberRegisterController {

    private final MemberRegisterUseCase memberRegisterUseCase;

    @PostMapping
    public ResponseEntity<Void> createMember(MemberRegisterRequest memberRegisterRequest) {
        memberRegisterUseCase.register(memberRegisterRequest.convertCommand());
        return ResponseEntity.noContent().build();
    }
}

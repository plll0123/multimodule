package org.example.board.application;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.board.domain.Board;
import org.example.board.port.in.BoardCreateUseCase;
import org.example.board.port.out.BoardCreateGateWay;
import org.example.member.domain.Member;
import org.example.member.port.in.MemberQueryUseCase;
import org.example.member.port.in.MemberRegisterUseCase;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Transactional
public class BoardCreateExecuter implements BoardCreateUseCase {

    private final BoardCreateGateWay boardCreateGateWay;
    private final MemberQueryUseCase memberQueryUseCase;

    @Override
    public void boardCreate(final Long memberId, final String title) {
        final Member writer = memberQueryUseCase.getMember(memberId);
        System.out.println("BoardCreateExecuter.boardCreate@@@@@@@");
        boardCreateGateWay.create(new Board(writer, title));
    }
}

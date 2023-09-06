package org.example.board.adapter.persistence;

import lombok.RequiredArgsConstructor;
import org.example.board.domain.Board;
import org.example.board.port.out.BoardCreateGateWay;
import org.example.member.domain.Member;
import org.example.member.rds.entity.MemberEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BoardCreateRepository implements BoardCreateGateWay {

    private final BoardRepository boardRepository;

    @Override
    public void create(Board board) {
        Member writer = board.writer();
        boardRepository.save(new BoardEntity(
                new MemberEntity(writer.id(), writer.loginId()), board.title())
        );
    }
}

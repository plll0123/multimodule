package org.example.board.domain;

import org.example.member.domain.Member;

public class Board {

    private Long id;
    private Member writer;
    private String title;

    public Board(Member writer, String title) {
        this.writer = writer;
        this.title = title;
    }

    public Member writer() {
        return writer;
    }

    public String title() {
        return title;
    }
}

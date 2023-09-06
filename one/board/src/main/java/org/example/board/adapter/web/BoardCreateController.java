package org.example.board.adapter.web;

import lombok.RequiredArgsConstructor;
import org.example.board.port.in.BoardCreateUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardCreateController {

    private final BoardCreateUseCase boardCreateUseCase;

    @PostMapping
    public ResponseEntity<String> createBoard(final Long memberId, final String title) {
        boardCreateUseCase.boardCreate(memberId, title);
        return ResponseEntity.ok("created!");
    }
}

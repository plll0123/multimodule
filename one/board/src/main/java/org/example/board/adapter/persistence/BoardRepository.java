package org.example.board.adapter.persistence;

import org.springframework.data.repository.Repository;

public interface BoardRepository extends Repository<BoardEntity, Long> {

    BoardEntity save(BoardEntity board);
}

package org.example.board.adapter.persistence;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Cleanup;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class CommentEntity {

    @Id
    @GeneratedValue
    @Column(name = "comment_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private BoardEntity boardEntity;

    @Column(name = "super_comment")
    private Long superComment;

    private String content;

    public CommentEntity(Long targetId, String content) {
        this.targetId = targetId;
        this.content = content;
    }
}

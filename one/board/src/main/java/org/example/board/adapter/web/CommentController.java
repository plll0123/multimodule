package org.example.board.adapter.web;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.board.adapter.persistence.CommentEntity;
import org.example.board.adapter.persistence.CommentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {

    private final CommentRepository commentRepository;

    @GetMapping
    public List<CommentEntity> comments(final Long commentId) {
        return commentRepository.findAllById(List.of(commentId));
    }

    @PostMapping
    public void createcomment(final Long taggedCommentId, final String comment) {
        commentRepository.save(new CommentEntity(taggedCommentId, comment));
    }

    @PostMapping("/subComment")
    public void createSubComment(final Long )
}

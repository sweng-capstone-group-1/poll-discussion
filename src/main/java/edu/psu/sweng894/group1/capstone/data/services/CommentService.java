package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.Comment;
import edu.psu.sweng894.group1.capstone.data.repositories.CommentRepository;

public class CommentService {

    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment createComment(Comment comment) {
        return null;
    }

    public Comment addReply(Comment comment, Comment replyTo) {
        return null;
    }

}

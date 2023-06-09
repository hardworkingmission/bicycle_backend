package org.bicycle.backend.dao.jpa;

import org.bicycle.backend.models.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}

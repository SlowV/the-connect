package com.outside.theconnect.repository;

import com.outside.theconnect.domain.Group;
import com.outside.theconnect.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

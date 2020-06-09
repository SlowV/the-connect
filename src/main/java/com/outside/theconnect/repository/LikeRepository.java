package com.outside.theconnect.repository;

import com.outside.theconnect.domain.Group;
import com.outside.theconnect.domain.Like;
import com.outside.theconnect.domain.composite.LikeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, LikeId> {
}

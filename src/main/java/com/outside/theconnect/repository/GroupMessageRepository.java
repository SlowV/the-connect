package com.outside.theconnect.repository;

import com.outside.theconnect.domain.Group;
import com.outside.theconnect.domain.GroupMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupMessageRepository extends JpaRepository<GroupMessage, Long> {
}

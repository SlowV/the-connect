package com.outside.theconnect.repository;

import com.outside.theconnect.domain.Chat;
import com.outside.theconnect.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {
}

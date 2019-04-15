package com.example.demo.repo;

import com.example.demo.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepo extends JpaRepository<Session,Integer> {
    Session getBySessionNumber(long sessionNumber);
    Session save(Session session);

}

package org.example.ProjetBlogTechno.core.repository;

import org.example.ProjetBlogTechno.core.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserImpl extends JpaRepository<User,Long> {
}

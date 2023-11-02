package org.example.ProjetBlogTechno.core.repository;

import org.example.ProjetBlogTechno.core.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserImpl extends JpaRepository<User,Long> {
}

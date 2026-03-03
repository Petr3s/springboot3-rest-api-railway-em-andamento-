package me.dio.demo.domain.repository;

import me.dio.demo.domain.repositoy.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
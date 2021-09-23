package me.daroguzo.jwt.repository;

import me.daroguzo.jwt.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
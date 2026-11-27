
package com.example.CRUDSpringBootDemo.repository;

import com.example.CRUDSpringBootDemo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

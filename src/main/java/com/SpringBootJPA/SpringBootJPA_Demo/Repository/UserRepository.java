package com.SpringBootJPA.SpringBootJPA_Demo.Repository;

import com.SpringBootJPA.SpringBootJPA_Demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}


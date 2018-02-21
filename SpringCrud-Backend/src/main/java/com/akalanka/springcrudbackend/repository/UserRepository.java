package com.akalanka.springcrudbackend.repository;

import com.akalanka.springcrudbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{

}

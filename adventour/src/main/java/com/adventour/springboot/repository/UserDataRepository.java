package com.adventour.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adventour.springboot.model.UserEntity;

@Repository
public interface UserDataRepository extends JpaRepository<UserEntity, Long>{

}

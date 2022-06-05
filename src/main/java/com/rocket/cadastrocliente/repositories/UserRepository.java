package com.rocket.cadastrocliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocket.cadastrocliente.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}

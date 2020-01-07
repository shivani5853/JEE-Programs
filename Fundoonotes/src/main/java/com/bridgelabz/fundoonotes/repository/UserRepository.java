package com.bridgelabz.fundoonotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.fundoonotes.dto.UpdatePassword;
import com.bridgelabz.fundoonotes.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "select * from user where email=?", nativeQuery = true)
	User checkByEmail(String email);

	@Query(value = "select * from user where id=?", nativeQuery = true)
	User findById(int id);
	
	@Query(value="select * from user where email=?", nativeQuery = true)
	User FindByEmail(String email);
	
	
	@Modifying
	@Transactional
	@Query(value = "update user set is_verified =true where id=?",nativeQuery = true)
	void updateIsVarified(int id);

	@Query(value = "select * from user where password=?",nativeQuery = true)
	User FindByPassword(UpdatePassword password);

	@Modifying
	@Transactional
	@Query(value = "update user set password=? where id=?",nativeQuery = true)
	void updatePassword(String password,int id);

}
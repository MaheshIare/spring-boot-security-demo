/**
 * 
 */
package com.java.techhub.security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.techhub.security.demo.model.Users;

/**
 * @author mahes
 *
 */
public interface UsersRepository extends JpaRepository<Users, String> {

}

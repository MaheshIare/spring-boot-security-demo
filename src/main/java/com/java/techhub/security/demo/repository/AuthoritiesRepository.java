/**
 * 
 */
package com.java.techhub.security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.techhub.security.demo.model.Authorities;

/**
 * @author mahes
 *
 */
public interface AuthoritiesRepository extends JpaRepository<Authorities, String> {

}

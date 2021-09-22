package com.digital.digitalservicos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.digitalservicos.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}

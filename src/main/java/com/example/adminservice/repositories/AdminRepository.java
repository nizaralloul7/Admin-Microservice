package com.example.adminservice.repositories;


import com.example.adminservice.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long>
{
    Optional<Admin> findAdminByUsername(String username);
}

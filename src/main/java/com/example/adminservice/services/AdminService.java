package com.example.adminservice.services;



import com.example.adminservice.entities.Admin;
import com.example.adminservice.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService
{
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository)
    {
        this.adminRepository = adminRepository;
    }


    public void addAdmin(Admin admin)
    {
        Optional<Admin> adminByUsername = adminRepository.findAdminByUsername(admin.getUsername());
        if(adminByUsername.isPresent())
        {
            throw new IllegalStateException("admin Already Exists");
        }
        adminRepository.save(admin);
    }

    public List<Admin> getAdmins()
    {
        return adminRepository.findAll();
    }

    public void deleteAdmin(Long adminId)
    {
        boolean adminExists = adminRepository.existsById(adminId);

        if(!adminExists)
        {
            throw new IllegalStateException("admin with id "+adminId+" doesnt exist");
        }
        adminRepository.deleteById(adminId);
    }


}
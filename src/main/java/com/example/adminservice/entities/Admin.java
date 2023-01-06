package com.example.adminservice.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;


@Entity
@Table
@Data
public class Admin
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @PrePersist
    public void setCreationDateTime() {
        this.createdAt = LocalDateTime.now();
    }
    @PreUpdate
    public void setChangeDateTime() {
        this.updatedAt = LocalDateTime.now();
    }
}

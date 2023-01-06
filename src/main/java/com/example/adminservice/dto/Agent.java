package com.example.adminservice.dto;

import lombok.Data;
import java.util.Date;


@Data
public class Agent
{
    private String firstName;
    private String lastName;
    private String cin;
    private double plafond;
    private String phone;
    private Date dateCreation;

}

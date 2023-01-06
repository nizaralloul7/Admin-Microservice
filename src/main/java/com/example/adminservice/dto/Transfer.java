package com.example.adminservice.dto;

import java.util.Date;

public class Transfer {
    private String reference;
    private double amount;
    private Date dateExpiration;
    private String referenceAgent;
    private String referenceSender;
    private String referenceReciever;
    private StatusTransfer state;
    private String transferCode;
}

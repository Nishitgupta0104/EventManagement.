package com.attendeemanagement.attendee_management.model;

import jakarta.persistence.*;

@Entity
public class Invitation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long attendeeId;

    private String status; // Sent, Accepted, Declined

    // Getters and Setters
}

package com.attendeemanagement.attendee_management.repository;

import com.attendeemanagement.attendee_management.model.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvitationRepository extends JpaRepository<Invitation, Long> {
}

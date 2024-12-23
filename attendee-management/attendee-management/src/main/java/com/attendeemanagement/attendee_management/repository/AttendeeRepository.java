package com.attendeemanagement.attendee_management.repository;

import com.attendeemanagement.attendee_management.model.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
}

package com.attendeemanagement.attendee_management.service;

import com.attendeemanagement.attendee_management.model.Attendee;
import com.attendeemanagement.attendee_management.repository.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendeeService {

    @Autowired
    private AttendeeRepository attendeeRepository;

    @Autowired
    private EventClient eventClient;

    public Attendee registerAttendee(Attendee attendee) {
        // Validate event ID using Feign Client
        Object event = eventClient.getEventById(attendee.getEventId());
        if (event == null) {
            throw new RuntimeException("Invalid Event ID");
        }
        return attendeeRepository.save(attendee);
    }

    public List<Attendee> getAllAttendees() {
        return attendeeRepository.findAll();
    }
}
package com.attendeemanagement.attendee_management.controller;

import com.attendeemanagement.attendee_management.model.Attendee;
import com.attendeemanagement.attendee_management.service.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendees")
public class AttendeeController {

    @Autowired
    private AttendeeService attendeeService;

    @PostMapping
    public ResponseEntity<Attendee> registerAttendee(@RequestBody Attendee attendee) {
        Attendee savedAttendee = attendeeService.registerAttendee(attendee);
        return ResponseEntity.ok(savedAttendee);
    }

    @GetMapping
    public ResponseEntity<List<Attendee>> getAllAttendees() {
        List<Attendee> attendees = attendeeService.getAllAttendees();
        return ResponseEntity.ok(attendees);
    }
}
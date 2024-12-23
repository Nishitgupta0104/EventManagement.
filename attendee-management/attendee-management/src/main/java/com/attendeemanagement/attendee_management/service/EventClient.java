package com.attendeemanagement.attendee_management.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "event_management")
public interface EventClient {
    @GetMapping("/events/{id}")
    Object getEventById(@PathVariable Long id);
}
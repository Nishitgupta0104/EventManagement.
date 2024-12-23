package com.PDI.event_management.service;

import com.PDI.event_management.model.Event;
import com.PDI.event_management.model.Vendor;
import com.PDI.event_management.model.Venue;
import com.PDI.event_management.repository.EventRepository;
import com.PDI.event_management.repository.VendorRepository;
import com.PDI.event_management.repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private VenueRepository venueRepository;

    @Autowired
    private VendorRepository vendorRepository;

    public Event saveEvent(Event event) {
        // Fetch Venue by ID
        Long venueId = event.getVenue().getId();
        Optional<Venue> venue = venueRepository.findById(venueId);
        if (venue.isEmpty()) {
            throw new RuntimeException("Venue with ID " + venueId + " not found");
        }

        // Fetch Vendor by ID
        Long vendorId = event.getVendor().getId();
        Optional<Vendor> vendor = vendorRepository.findById(vendorId);
        if (vendor.isEmpty()) {
            throw new RuntimeException("Vendor with ID " + vendorId + " not found");
        }

        // Set the fetched Venue and Vendor in the Event
        event.setVenue(venue.get());
        event.setVendor(vendor.get());

        // Save the Event
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}

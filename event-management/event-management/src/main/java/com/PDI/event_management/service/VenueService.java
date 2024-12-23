package com.PDI.event_management.service;

import com.PDI.event_management.model.Venue;
import com.PDI.event_management.repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueService {

    @Autowired
    private VenueRepository venueRepository;

    public List<Venue> getAllVenues() {
        return venueRepository.findAll();
    }

    public Venue createVenue(Venue venue) {
        return venueRepository.save(venue);
    }
}


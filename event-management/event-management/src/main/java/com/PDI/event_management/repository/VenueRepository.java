package com.PDI.event_management.repository;

import com.PDI.event_management.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue, Long> {
}


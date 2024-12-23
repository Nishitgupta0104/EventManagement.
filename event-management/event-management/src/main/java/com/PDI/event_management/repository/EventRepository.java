package com.PDI.event_management.repository;

import com.PDI.event_management.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}

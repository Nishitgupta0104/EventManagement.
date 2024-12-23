package com.PDI.event_management.repository;

import com.PDI.event_management.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}


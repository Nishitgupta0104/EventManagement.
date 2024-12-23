package com.PDI.event_management.controller;

import com.PDI.event_management.model.Vendor;
import com.PDI.event_management.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendors")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @GetMapping
    public List<Vendor> getAllVendors() {
        return vendorService.getAllVendors();
    }

    @PostMapping
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return vendorService.createVendor(vendor);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        vendorService.deleteVendor(id);
    }
}

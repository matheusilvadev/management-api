package com.astrocode.api_satellite.controller;

import com.astrocode.api_satellite.dtos.SatelliteDTO;
import com.astrocode.api_satellite.entities.SatelliteModel;
import com.astrocode.api_satellite.services.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/satellites")
public class SatelliteController {
    @Autowired
    private SatelliteService satelliteService;

    @GetMapping("/{id}")
    public ResponseEntity<SatelliteModel> getSatellliteById(@PathVariable Long id){
        SatelliteModel satelliteFound = satelliteService.getSatelliteById(id);
        return new ResponseEntity<>(satelliteFound, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<SatelliteModel> addSatellite(@RequestBody SatelliteDTO dto){
        SatelliteModel satellite = satelliteService.addSatellite(dto);
        return new ResponseEntity<>(satellite, HttpStatus.CREATED);
    }
}

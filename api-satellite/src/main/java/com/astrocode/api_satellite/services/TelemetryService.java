package com.astrocode.api_satellite.services;


import com.astrocode.api_satellite.dtos.TelemetryDataDTO;
import com.astrocode.api_satellite.entities.SatelliteModel;
import com.astrocode.api_satellite.entities.TelemetryData;
import com.astrocode.api_satellite.repositry.SatelliteRepository;
import com.astrocode.api_satellite.repositry.TelemetryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelemetryService {

    @Autowired
    private TelemetryRepository telemetryRepository;

    @Autowired
    private SatelliteRepository satelliteRepository;

    public TelemetryData addTelemetryData(Long satellitId, TelemetryDataDTO dto){
        SatelliteModel satellite = satelliteRepository.findById(satellitId)
                .orElseThrow(() -> new EntityNotFoundException("Satellite não encontrado"));

        TelemetryData telemetryData = new TelemetryData();
        BeanUtils.copyProperties(dto, telemetryData);
        telemetryData.setSatelliteModel(satellite);

        return telemetryRepository.save(telemetryData);
    }
}

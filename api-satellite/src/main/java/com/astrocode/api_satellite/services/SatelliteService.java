package com.astrocode.api_satellite.services;

import com.astrocode.api_satellite.dtos.SatelliteDTO;
import com.astrocode.api_satellite.dtos.TelemetryDataDTO;
import com.astrocode.api_satellite.entities.SatelliteModel;
import com.astrocode.api_satellite.entities.TelemetryData;
import com.astrocode.api_satellite.repositry.SatelliteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SatelliteService {

    @Autowired
    SatelliteRepository satelliteRepository;

    public SatelliteModel getSatelliteById(Long id){
       return satelliteRepository.findById(id)
               .orElseThrow(() -> new EntityNotFoundException("ID não encontrado!"));
    }

    public SatelliteModel addSatellite(SatelliteDTO dto){

        if (dto.nome() == null && dto.status() == null){
            throw new IllegalArgumentException("Nome e status não podem estar vazios");
        }

        SatelliteModel novoSatelite = new SatelliteModel();

        novoSatelite.setName(dto.nome());
        novoSatelite.setStatus(dto.status());
        novoSatelite.setTelemetryData(dto.telemetryDataList());

        return satelliteRepository.save(novoSatelite);
    }

    public SatelliteModel addTelemetryToSatellite(Long satelliteId, TelemetryDataDTO telemetryDTO){
        SatelliteModel satellite =  satelliteRepository.findById(satelliteId)
                .orElseThrow(() -> new EntityNotFoundException("Satelite não encontrado"));

        TelemetryData telemetryData = new TelemetryData();
        BeanUtils.copyProperties(telemetryDTO, telemetryData);
        telemetryData.setSatelliteModel(satellite);

        satellite.getTelemetryData().add(telemetryData);

        return satelliteRepository.save(satellite);
    }

    public void deleteSatellite(Long satelliteId) {
        if (!satelliteRepository.existsById(satelliteId)) {
            throw new EntityNotFoundException("Satélite não encontrado com ID: " + satelliteId);
        }
        satelliteRepository.deleteById(satelliteId); // CascadeType.ALL garante exclusão dos dados de telemetria associados
    }


}



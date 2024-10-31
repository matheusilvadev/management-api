package com.astrocode.api_satellite.dtos;

import com.astrocode.api_satellite.entities.TelemetryData;
import com.astrocode.api_satellite.enums.Status;

import java.util.List;

public record SatelliteDTO(String nome,
                           Status status,
                           List<TelemetryData> telemetryDataList) {
}

package com.astrocode.api_satellite.dtos;

import com.astrocode.api_satellite.entities.TelemetryData;

import java.util.List;

public record TelemetryDataDTO(List<TelemetryData> telemetryDataDTO) {
}

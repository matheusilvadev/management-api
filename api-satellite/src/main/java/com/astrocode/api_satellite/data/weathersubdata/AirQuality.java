package com.astrocode.api_satellite.data.weathersubdata;

import com.astrocode.api_satellite.enums.SuspendedParticles;
import jakarta.persistence.Embeddable;

@Embeddable
public record AirQuality(double coLevels,
                         SuspendedParticles suspendedParticles) {
}

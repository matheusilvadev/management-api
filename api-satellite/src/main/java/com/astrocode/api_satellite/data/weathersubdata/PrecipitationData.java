package com.astrocode.api_satellite.data.weathersubdata;

import com.astrocode.api_satellite.enums.PrecipitationType;
import jakarta.persistence.Embeddable;

@Embeddable
public record PrecipitationData(double precipitationRate,
                                PrecipitationType precipitationType) {
}

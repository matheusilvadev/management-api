package com.astrocode.api_satellite.data;

import com.astrocode.api_satellite.data.weathersubdata.*;
import jakarta.persistence.Embeddable;

@Embeddable
public record WeatherConditions(AtmosphericData atmosphericData,
                                PrecipitationData precipitationData,
                                CloudData cloudData,
                                RadiationData radiationData,
                                SurfaceData surfaceData,
                                AirQuality airQuality) {
}

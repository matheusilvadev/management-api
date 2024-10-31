package com.astrocode.api_satellite.data.weathersubdata;

import jakarta.persistence.Embeddable;

@Embeddable
public record AtmosphericData(double airTemperature,
                              double relativeHumidity,
                              double atmosphericPressure,
                              double windSpeed,
                              double windDirection) {
}

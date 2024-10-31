package com.astrocode.api_satellite.data.weathersubdata;

import jakarta.persistence.Embeddable;

@Embeddable
public record RadiationData(double solarRadiation,
                            double ultravioletRadiation,
                            double infraredRadiation) {
}

package com.astrocode.api_satellite.data.enginesubdata;

import jakarta.persistence.Embeddable;

@Embeddable
public record SolarPainels(double latitude,
                           double inclination,
                           String orientation) {
}

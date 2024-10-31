package com.astrocode.api_satellite.data.navigationsubdata;

import jakarta.persistence.Embeddable;

@Embeddable
public record OrbitalCordinates(double longitudeOrbital,
                                double latitudeOrbital,
                                double altitudeOrbital) {
}

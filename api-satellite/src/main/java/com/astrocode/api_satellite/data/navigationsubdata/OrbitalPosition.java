package com.astrocode.api_satellite.data.navigationsubdata;

import jakarta.persistence.Embeddable;

@Embeddable
public record OrbitalPosition(OrbitalCordinates orbitalCordinates) {
}

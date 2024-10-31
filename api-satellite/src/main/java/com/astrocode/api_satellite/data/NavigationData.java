package com.astrocode.api_satellite.data;

import com.astrocode.api_satellite.data.navigationsubdata.OrbitalCordinates;
import jakarta.persistence.Embeddable;

@Embeddable
public record NavigationData(OrbitalCordinates orbitalCordinates,
                             double obritalSpeed) {
}

package com.astrocode.api_satellite.data.weathersubdata;

import jakarta.persistence.Embeddable;

@Embeddable
public record SurfaceData(double sst,
                          double waveHeight) {
}

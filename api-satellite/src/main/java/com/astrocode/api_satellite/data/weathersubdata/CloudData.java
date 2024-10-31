package com.astrocode.api_satellite.data.weathersubdata;

import com.astrocode.api_satellite.enums.CloudType;
import jakarta.persistence.Embeddable;

@Embeddable
public record CloudData(double cloudCoverage,
                        CloudType cloudType) {
}

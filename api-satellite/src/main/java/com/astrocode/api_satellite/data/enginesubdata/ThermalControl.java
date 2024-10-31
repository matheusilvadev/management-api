package com.astrocode.api_satellite.data.enginesubdata;

import jakarta.persistence.Embeddable;

@Embeddable
public record ThermalControl(double internalTemperature) {
}

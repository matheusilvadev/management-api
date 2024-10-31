package com.astrocode.api_satellite.data.enginesubdata;

import jakarta.persistence.Embeddable;

@Embeddable
public record EnergyData(double solarEnergy,
                         double batteryPower,
                         SolarPainels statusPainels) {
}

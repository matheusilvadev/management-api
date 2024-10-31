package com.astrocode.api_satellite.data;

import com.astrocode.api_satellite.data.enginesubdata.EnergyData;
import com.astrocode.api_satellite.data.enginesubdata.Orientation;
import com.astrocode.api_satellite.data.enginesubdata.ThermalControl;
import jakarta.persistence.Embeddable;

@Embeddable
public record EngineData(EnergyData energyData,
                         Orientation orientation,
                         ThermalControl thermalControl) {
}

package com.astrocode.api_satellite.entities;

import com.astrocode.api_satellite.data.EngineData;
import com.astrocode.api_satellite.data.NavigationData;
import com.astrocode.api_satellite.data.WeatherConditions;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Embeddable
public class TelemetryData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "satellite_id")
    private SatelliteModel satelliteModel;

    @Embedded
    private WeatherConditions weatherConditions;

    @Embedded
    private EngineData engineData;

    @Embedded
    private NavigationData navigationData;

}

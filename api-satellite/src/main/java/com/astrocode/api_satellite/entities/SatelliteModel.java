package com.astrocode.api_satellite.entities;

import com.astrocode.api_satellite.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.Email;

import java.util.List;

@Entity
@Data
public class SatelliteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy = "satelliteModel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TelemetryData> telemetryData;

}

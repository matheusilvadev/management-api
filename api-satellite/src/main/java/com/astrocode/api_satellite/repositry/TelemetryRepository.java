package com.astrocode.api_satellite.repositry;

import com.astrocode.api_satellite.entities.TelemetryData;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelemetryRepository extends JpaRepository<TelemetryData, Long> {
}

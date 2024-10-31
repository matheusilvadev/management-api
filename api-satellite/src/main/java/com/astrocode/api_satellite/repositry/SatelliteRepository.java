package com.astrocode.api_satellite.repositry;
import com.astrocode.api_satellite.entities.SatelliteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SatelliteRepository extends JpaRepository<SatelliteModel, Long> {
}

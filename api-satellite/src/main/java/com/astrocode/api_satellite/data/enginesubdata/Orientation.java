package com.astrocode.api_satellite.data.enginesubdata;

import jakarta.persistence.Embeddable;

@Embeddable
public record Orientation(double gyroscope,
                          double accelerometer,
                          double magnetometer,
                          String starSencors,
                          double sunPosition) {
}

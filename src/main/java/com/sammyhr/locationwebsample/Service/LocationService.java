package com.sammyhr.locationwebsample.Service;

import com.sammyhr.locationwebsample.Entities.Location;

import java.util.List;

public interface LocationService {

    Location saveLocation(Location location);

    Location updateLocation(Location location);

    void deleteLocation(Location location);

    Location getLocationById(int id);

    List<Location> getallLocation();
}

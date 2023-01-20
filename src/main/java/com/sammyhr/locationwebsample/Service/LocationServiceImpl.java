package com.sammyhr.locationwebsample.Service;

import com.sammyhr.locationwebsample.Entities.Location;
import com.sammyhr.locationwebsample.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements  LocationService{

    @Autowired
    private  LocationRepository repository;

    @Override
    public Location saveLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {

        return repository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        repository.delete(location);
    }

    @Override
    public Location getLocationById(int id) {

        return repository.findById(id).get();
    }

    @Override
    public List<Location> getallLocation() {
        return repository.findAll();
    }
}

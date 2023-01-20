package com.sammyhr.locationwebsample.Repository;

import com.sammyhr.locationwebsample.Entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}

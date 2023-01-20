package com.sammyhr.locationwebsample.Controller;

import com.sammyhr.locationwebsample.Entities.Location;
import com.sammyhr.locationwebsample.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping("/showCreate")
    public String showCreate(){
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String savelocation(@ModelAttribute ("location")Location location, ModelMap modelMap){
       Location location1=locationService.saveLocation(location);
       String msg="Location saved in ID: "+ location1.getId();
       modelMap.addAttribute("msg",msg);
        return "createLocation";
    }
    @RequestMapping("/displaylocation")
    public String displayAllLocations(ModelMap modelMap){
        List<Location> aallocations=locationService.getallLocation();
        modelMap.addAttribute("locations",aallocations);
        return "displaylocation";
    }
}

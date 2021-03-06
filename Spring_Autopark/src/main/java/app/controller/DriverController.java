//package app.controller;
//
//import app.entity.Driver;
//import app.repository.DriverRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.Map;
//
//@Controller
//public class DriverController {
//
//    @Autowired
//    private DriverRepository driverRepository;
//
//    @GetMapping("/driver")
//    public String showAllDrivers(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
//        Iterable<Driver> drivers = driverRepository.findAll();
//        model.put("drivers", drivers);
//        return "driver";
//    }
// }
//

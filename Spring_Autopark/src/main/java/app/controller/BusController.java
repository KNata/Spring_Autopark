package app.controller;

import app.entity.Bus;
import app.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;

@Controller
public class BusController {

    @Autowired
    private BusRepository busRepository;

    @GetMapping("/buses")
    public String showAllBuses(Map<String, Object> model) {
        Iterable<Bus> routes = busRepository.findAll();
        model.put("buses", routes);
        return "busesPage";
    }

    @GetMapping("/deleteBus")
    public String showAllBusesOnDeletePage(Map<String, Object> model) {
        Iterable<Bus> routes = busRepository.findAll();
        model.put("buses", routes);
        return "busesPage";
    }

    @PostMapping("/buses")
    public String addBus(@RequestParam String busID, @RequestParam String busModel, @RequestParam String maxCountOfPassegers,
                         @RequestParam String miles,
                           Map<String, Object> model) {
        System.out.println("busID = " + busID);
        System.out.println("busModel = " + busModel);
        System.out.println("maxCountOfPassegers = " + maxCountOfPassegers);
        System.out.println("miles = " + miles);

        if (busID != null && busModel != null && maxCountOfPassegers != null && miles != null) {
            Integer milesI = Integer.valueOf(miles);
            Integer maxCountOfPass = Integer.valueOf(maxCountOfPassegers);
            Bus theBus = Bus.newBuilder().setBusID(busID).setBusModel(busModel).setmaxCountOfPassagers(maxCountOfPass).setMiles(milesI)
                    .build();
            busRepository.save(theBus);
            System.out.println("Saved");
            Iterable<Bus> buses = busRepository.findAll();
            model.put("bus", buses);
            return "busesPage";
        } else {
            return "error";
        }

    }

    @PostMapping("/deleteBus")
    public String deleteRoute(@RequestParam String busID, Map<String, Object> model) {
        if (busID != null && busRepository.findById(busID) != null) {
            busRepository.deleteById(busID);
            return "success";
        } else {
            return "error";
        }
    }
}

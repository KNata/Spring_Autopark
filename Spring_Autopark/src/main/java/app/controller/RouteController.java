//package app.controller;
//
//import app.entity.Route;
//import app.repository.BusRepository;
//import app.repository.DriverRepository;
//import app.repository.RouteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import java.util.Map;
//
//@Controller
//public class RouteController {
//
//    @Autowired
//    private RouteRepository routeRepository;
//    @Autowired
//    private DriverRepository driverRepository;
//    @Autowired
//    private BusRepository busRepository;
//
//    @GetMapping("/route")
//    public String showAllRoutes(Map<String, Object> model) {
//        Iterable<Route> routes = routeRepository.findAll();
//        model.put("routes", routes);
//        return "routes";
//    }
//
//    @PostMapping("/addRoute")
//    public String addRoute(@RequestParam String routeName, @RequestParam String cityOfDeparture, @RequestParam String cityOfArrival,
//                      @RequestParam int routeDuration, @RequestParam String driverID, @RequestParam String busID,
//                      @RequestParam String departureTime, @RequestParam String arrivalTime,
//                      Map<String, Object> model) {
//        if (cityOfArrival != cityOfDeparture && busRepository.findById(busID) != null && driverRepository.findById(driverID) != null) {
//            Route theRoute = Route.newBuilder().setBusID(busID).setDriver(busID).setRouteEndTime(arrivalTime)
//                    .setRouteEnd(cityOfArrival).setRouteStartTime(departureTime).setRouteBegin(cityOfDeparture)
//                    .setRouteTitle(routeName).build();
//            routeRepository.save(theRoute);
//            return "success";
//        } else {
//            return "error";
//        }
//
//    }
//
//    @PostMapping("/editRoute")
//    public String editRoute(@RequestParam String routeName, @RequestParam String cityOfDeparture, @RequestParam String cityOfArrival,
//                      @RequestParam int routeDuration, @RequestParam String driverID, @RequestParam String busID,
//                      @RequestParam String departureTime, @RequestParam String arrivalTime,
//                      Map<String, Object> model) {
//        if (cityOfArrival != cityOfDeparture && busRepository.findById(busID) != null && driverRepository.findById(driverID) != null) {
////            Route theRoute = Route.newBuilder().setBusID(busID).setDriver(busID).setRouteEndTime(arrivalTime)
////                    .setRouteEnd(cityOfArrival).setRouteStartTime(departureTime).setRouteBegin(cityOfDeparture)
////                    .setRouteTitle(routeName).build();
//           // routeRepository.
//            return "success";
//        } else {
//            return "error";
//        }
//
//    }
//
//    @PostMapping("/deleteRoute")
//    public String deleteRoute(@RequestParam Integer routeID, Map<String, Object> model) {
//        if (routeID != null && routeRepository.findById(routeID) != null) {
//            routeRepository.deleteById(routeID);
//            return "success";
//        } else {
//            return "error";
//        }
//    }
//
//}

package com.ead.controller;

import com.ead.entity.Flight;
import com.ead.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author supun
 * Date: 10/22/2021
 * Time: 11:38 AM
 */
@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping
    public ResponseEntity<Flight> saveFlight(@RequestBody Flight flight) {
        var f = flightService.saveFlight(flight);
        return new ResponseEntity<>(f, HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights() {
        var flights = flightService.getAllFlights();
        return new ResponseEntity<>(flights, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Flight> updateFlight(Flight flight) {
        var f = flightService.updateFlight(flight);
        return new ResponseEntity<Flight>(f, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deleteFlight(Long id) {
        flightService.deleteFlight(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}

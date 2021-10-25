package com.ead.service;

import com.ead.entity.Flight;
import com.ead.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author supun
 * Date: 10/22/2021
 * Time: 11:27 AM
 */
@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public Flight saveFlight(Flight flight) {
        Flight f = new Flight(flight.getFlightName());
        return flightRepository.save(f);
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight updateFlight(Flight f) {
        var flight = flightRepository.findById(f.getId()).get();
        flight.setFlightName(f.getFlightName());
        flight.setPassengers(f.getPassengers());
        flight.setTours(f.getTours());
        return flightRepository.save(flight);
    }

    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
}

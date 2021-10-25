package com.ead.service;

import com.ead.entity.Passenger;
import com.ead.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author supun
 * Date: 10/22/2021
 * Time: 12:39 PM
 */
@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public Passenger savePassenger(Passenger p) {
        return passengerRepository.save(p);
    }

    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public Passenger updatePassenger(Passenger p) {
        var passenger = passengerRepository.findById(p.getId()).get();
        passenger.setEmail(p.getEmail());
        passenger.setFlight(p.getFlight());
        passenger.setFName(p.getFName());
        passenger.setLName(p.getLName());
        passenger.setTours(p.getTours());
        passenger = passengerRepository.save(p);
        return passenger;
    }

    public void deletePassenger(Long passengerId) {
        passengerRepository.deleteById(passengerId);
    }
}

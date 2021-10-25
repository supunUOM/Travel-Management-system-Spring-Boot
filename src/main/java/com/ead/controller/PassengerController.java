package com.ead.controller;

import com.ead.entity.Passenger;
import com.ead.entity.Tour;
import com.ead.service.PassengerService;
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
 * Time: 12:36 PM
 */
@RestController
@RequestMapping(value = "/passengers")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping
    public ResponseEntity<Passenger> saveUser(@RequestBody Passenger p) {
        var u = passengerService.savePassenger(p);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Passenger>> getAllUsers() {
        var p = passengerService.getAllPassengers();
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Passenger> updatePassenger(@RequestBody Passenger p) {
        var pa = passengerService.updatePassenger(p);
        return new ResponseEntity<>(pa, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deletePassenger(Long passengerId) {
        passengerService.deletePassenger(passengerId);
        return new ResponseEntity(HttpStatus.OK);
    }

}

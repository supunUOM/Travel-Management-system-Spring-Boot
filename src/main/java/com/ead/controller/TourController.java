package com.ead.controller;

import com.ead.entity.Tour;
import com.ead.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author supun
 * Date: 10/23/2021
 * Time: 4:30 AM
 */
@RestController
@RequestMapping("/tours")
public class TourController {

    @Autowired
    private TourService tourService;

    @GetMapping
    public ResponseEntity<List<Tour>> getAllTours() {
        var tours = tourService.getAllTours();
        return new ResponseEntity<>(tours, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Tour> saveTour(@RequestBody Tour tour) {
        var t = tourService.saveTour(tour);
        return new ResponseEntity<>(t, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Tour> updateTour(@RequestBody Tour tour) {
        var t = tourService.updateTour(tour);
        return new ResponseEntity<Tour>(t, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deleteTour(Long id) {
        tourService.deleteTour(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}

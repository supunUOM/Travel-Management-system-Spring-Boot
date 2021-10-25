package com.ead.service;

import com.ead.entity.Tour;
import com.ead.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author supun
 * Date: 10/22/2021
 * Time: 1:32 PM
 */
@Service
public class TourService {

    @Autowired
    private TourRepository tourRepository;

    public Tour saveTour(Tour t) {
        return tourRepository.save(t);
    }

    public List<Tour> getAllTours() {
        return tourRepository.findAll();
    }

    public Tour updateTour(Tour t) {
        var tour = tourRepository.findById(t.getId()).get();
        tour.setFlight(t.getFlight());
        tour.setPassengers(t.getPassengers());
        tour.setArrivalTime(t.getArrivalTime());
        tour.setStartFrom(t.getStartFrom());
        tour.setEndFrom(t.getEndFrom());
        tour = tourRepository.save(tour);
        return tour;
    }

    public void deleteTour(Long id) {
        tourRepository.deleteById(id);
    }
}

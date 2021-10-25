package com.ead.repository;

import com.ead.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 *
 * @author supun
 * Date: 10/22/2021
 * Time: 11:13 AM
 */
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}

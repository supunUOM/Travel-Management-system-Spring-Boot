package com.ead.repository;

import com.ead.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 *
 * @author supun
 * Date: 10/22/2021
 * Time: 11:14 AM
 */
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}

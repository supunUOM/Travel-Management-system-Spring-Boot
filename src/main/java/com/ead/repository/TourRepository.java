package com.ead.repository;

import com.ead.entity.Tour;
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
public interface TourRepository extends JpaRepository<Tour, Long> {
}

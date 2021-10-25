package com.ead.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author supun
 * Date: 10/21/2021
 * Time: 10:20 PM
 */
@Entity
@Data
@NoArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;

    @Column
    private String flightName;

    @OneToMany(mappedBy = "flight")
    private List<Passenger> passengers;

    @OneToMany(mappedBy = "flight")
    private List<Tour> tours;

    public Flight(String flightName) {
        this.flightName = flightName;
    }
}

package com.ead.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author supun
 * Date: 10/22/2021
 * Time: 10:02 AM
 */
@Entity
@Data
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String startFrom;

    @Column
    private String endFrom;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date arrivalTime;

    @ManyToMany
    private List<Passenger> passengers;

    @ManyToOne()
    private Flight flight;
}

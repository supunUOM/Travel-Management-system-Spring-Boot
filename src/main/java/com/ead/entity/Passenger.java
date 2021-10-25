package com.ead.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author supun
 * Date: 10/21/2021
 * Time: 8:21 PM
 */
@Entity(name = "Passenger")
@Data
public class Passenger {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String email;

    @Column
    private String fName;

    @Column
    private String lName;

    @JoinColumn
    @ManyToOne
    private Flight flight;

    @ManyToMany(mappedBy = "passengers")
    private List<Tour> tours;
}

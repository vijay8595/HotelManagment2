package com.oyo.HotelManagment2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="name")
    String name;

    @Column(name="phone_number")
    String phoneNumber;

    @Column(name="email")
    String email;

    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    AdharDetails adharDetails;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Bookings> bookingsList= new ArrayList<>();



}

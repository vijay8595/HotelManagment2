package com.oyo.HotelManagment2.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "adhar_details")
public class AdharDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "url")
    String url;

    @Column(name = "dob")
    String dob;

    @OneToOne
    @JoinColumn
    @JsonIgnore
    Customer customer;
}

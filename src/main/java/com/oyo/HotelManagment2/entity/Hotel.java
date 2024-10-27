package com.oyo.HotelManagment2.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hotels")
public class Hotel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;

  @Column(name="hotel_id",nullable = false)
  Integer hotelId;

  @Column(name="hotel_name",nullable = false)
  String hotelName;

  @Column(name="address")
  String address;

  @Column(name="contact_number")
  String contactNumber;

  @Column(name="status")
  Boolean status;

}

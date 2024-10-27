package com.oyo.HotelManagment2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.oyo.HotelManagment2.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer> {


  Hotel findByHotelId(int hotelId);

}

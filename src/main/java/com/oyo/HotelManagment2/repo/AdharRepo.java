package com.oyo.HotelManagment2.repo;

import com.oyo.HotelManagment2.entity.AdharDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdharRepo extends JpaRepository<AdharDetails,Integer> {

}

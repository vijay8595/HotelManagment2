package com.oyo.HotelManagment2.controller;

import com.oyo.HotelManagment2.dto.response.PriceInventoryResponseDto;
import com.oyo.HotelManagment2.service.PriceInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PriceInvenotoryController {

    @Autowired
    private PriceInventoryService priceInventoryService;


    public List<PriceInventoryResponseDto> getPriceAndInvetoryForHotel(@RequestParam("hotelId") Integer hotelId, @RequestParam("checkin") LocalDate checkin) {
        return priceInventoryService.getPriceAndInvetoryForHotel(hotelId, checkin);

    }




}

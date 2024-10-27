package com.oyo.HotelManagment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.oyo.HotelManagment2.dto.request.HotelRequestDto;
import com.oyo.HotelManagment2.dto.response.HotelResponseDto;
import com.oyo.HotelManagment2.service.HotelService;

@RequestMapping("/api/v1/hotel")
@RestController
public class HotelController {

  @Autowired
  private HotelService hotelService;

  @PostMapping("/create")
  public Boolean createHotel(@RequestBody HotelRequestDto hotelRequestDto){
    Boolean success=hotelService.createHotel(hotelRequestDto);
    return success;

  }

  @GetMapping("/")
  public HotelResponseDto getAllHotels(@RequestParam Integer hotelId){
    hotelService

  }

}

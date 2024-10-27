package com.oyo.HotelManagment2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.oyo.HotelManagment2.dto.request.HotelRequestDto;
import com.oyo.HotelManagment2.dto.response.HotelResponseDto;
import com.oyo.HotelManagment2.entity.Hotel;
import com.oyo.HotelManagment2.repo.HotelRepository;

@Component
public class HotelService {

  @Autowired
  private HotelRepository hotelRepository;


  public Boolean createHotel(HotelRequestDto hotelRequestDto) {

    Hotel hotel = convertHotelRequestDtoToHotel(hotelRequestDto);
    hotelRepository.save(hotel);
    return true;
  }

  public HotelResponseDto getHotelDetails(Integer hotelId){

    Hotel hotel=hotelRepository.findByHotelId(hotelId);
    return convertHotelToResponseDto();

  }

  private HotelResponseDto convertHotelToResponseDto() {
    return null;
  }

  private Hotel convertHotelRequestDtoToHotel(HotelRequestDto hotelRequestDto) {

    Hotel hotel = new Hotel();
    hotel.setHotelName(hotelRequestDto.getHotelName());
    hotel.setHotelId(hotelRequestDto.getHotelId());
    hotel.setAddress(hotelRequestDto.getAddress());
    hotel.setContactNumber(hotelRequestDto.getContactNumber());
    hotel.setStatus(hotelRequestDto.getStatus());

    return hotel;
  }


}

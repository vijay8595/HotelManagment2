package com.oyo.HotelManagment2.service;


import com.oyo.HotelManagment2.Exception.HotelNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.oyo.HotelManagment2.dto.request.HotelRequestDto;
import com.oyo.HotelManagment2.dto.response.HotelResponseDto;
import com.oyo.HotelManagment2.entity.Hotel;
import com.oyo.HotelManagment2.repo.HotelRepository;

import java.util.Optional;

@Component
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;


    public Boolean createHotel(HotelRequestDto hotelRequestDto) {

        Hotel hotel = convertHotelRequestDtoToHotel(hotelRequestDto);
        hotelRepository.save(hotel);
        return true;
    }

    public HotelResponseDto getHotelDetails(Integer hotelId) throws HotelNotFoundException {

        Optional<Hotel> hotel = hotelRepository.findById(hotelId);
        if (!hotel.isPresent()) {
            throw new HotelNotFoundException("Hotel Not Present");
        }
        return convertHotelToResponseDto(hotel.get());

    }

    private HotelResponseDto convertHotelToResponseDto(Hotel hotel) {
        return HotelResponseDto.builder().hotelName(hotel.getHotelName())
                .address(hotel.getAddress()).rooms(hotel.getRoomList()).build();
//    HotelResponseDto hotelResponseDto = new HotelResponseDto();
//    hotelResponseDto.setHotelName(hotel.getHotelName());
//    hotelResponseDto.setAddress(hotel.getAddress());
//    hotelResponseDto.setRooms(hotel.getRoomList());

        // more details to set if you want that you share to your client
    }

    private Hotel convertHotelRequestDtoToHotel(HotelRequestDto hotelRequestDto) {

        Hotel hotel = new Hotel();
        hotel.setHotelName(hotelRequestDto.getHotelName());
        hotel.setAddress(hotelRequestDto.getAddress());
        hotel.setContactNumber(hotelRequestDto.getContactNumber());
        hotel.setStatus(hotelRequestDto.getStatus());

        return hotel;
    }


}

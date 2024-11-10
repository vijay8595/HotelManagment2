package com.oyo.HotelManagment2.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.oyo.HotelManagment2.entity.Room;
import jakarta.persistence.Column;
import lombok.*;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HotelResponseDto {

    String errorMessage;


    String hotelName;

    String address;
    String contactNumber;

    List<Room> rooms;



}

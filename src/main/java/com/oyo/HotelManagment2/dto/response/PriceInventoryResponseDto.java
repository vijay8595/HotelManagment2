package com.oyo.HotelManagment2.dto.response;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
public class PriceInventoryResponseDto {


    Integer hotelId;


    Integer roomId;


    Boolean  isSoldOut;


    Integer price;


    LocalDate date;


}

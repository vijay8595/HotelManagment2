package com.oyo.HotelManagment2.dto.response;

import java.time.LocalDate;

public class BookingRequestDto {

    Integer hotelId;

    Integer roomId;

    LocalDate checkin;

    LocalDate checkout;

    Integer customerId;

    Integer numberOfGuest;

    Integer bookingAmount;

}

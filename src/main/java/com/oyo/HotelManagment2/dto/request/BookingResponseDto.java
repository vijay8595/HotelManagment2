package com.oyo.HotelManagment2.dto.request;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingResponseDto {
  Integer customerId;
  Integer hotelId;
  Integer roomId;
  LocalDate checkIn;
  LocalDate checkOut;
  Integer numberOfGuest;
  Integer bookingAccount;
}

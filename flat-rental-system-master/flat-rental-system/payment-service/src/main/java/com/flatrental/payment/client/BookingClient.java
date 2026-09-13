package com.flatrental.payment.client;

import com.flatrental.payment.dto.BookingDto;

/**
 * Interface for calling booking-service directly.
 */
public interface BookingClient {
    BookingDto getBookingById(Long bookingId);
}

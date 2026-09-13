package com.flatrental.payment.client;

import com.flatrental.payment.dto.BookingDto;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * WebClient implementation of BookingClient for calling booking-service directly.
 */
@Component
public class BookingClientImpl implements BookingClient {

    private final WebClient bookingServiceWebClient;

    public BookingClientImpl(WebClient bookingServiceWebClient) {
        this.bookingServiceWebClient = bookingServiceWebClient;
    }

    @Override
    public BookingDto getBookingById(Long bookingId) {
        return bookingServiceWebClient.get()
                .uri("/api/bookings/{id}", bookingId)
                .retrieve()
                .bodyToMono(BookingDto.class)
                .block();
    }
}


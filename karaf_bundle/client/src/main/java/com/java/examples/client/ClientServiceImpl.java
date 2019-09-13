package com.java.examples.client;

import com.java.examples.common.Booking;
import com.java.examples.common.BookingService;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    private BookingService bookingService;

    @Override
    public List<Booking> bookings() {
        return bookingService.list();
    }

    @Override
    public void addBooking(Booking booking) {
        bookingService.add(booking);
    }

    public BookingService getBookingService() {
        return bookingService;
    }

    public void setBookingService(BookingService bookingService) {
        this.bookingService = bookingService;
    }
}

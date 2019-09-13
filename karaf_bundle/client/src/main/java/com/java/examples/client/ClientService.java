package com.java.examples.client;

import com.java.examples.common.Booking;

import java.util.List;

public interface ClientService {

    List<Booking> bookings();

    void addBooking(Booking booking);


}

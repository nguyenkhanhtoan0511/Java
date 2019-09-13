package com.java.examples.rest.api;

import java.util.Collection;

public interface BookingService {
    Collection<Booking> list();

    Booking get(Long id);

    void add(Booking booking);

    void update(Booking booking);

    void remove(Long id);

}

package com.java.examples.common;

import java.util.List;

public interface BookingService {

    List<Booking> list();

    Booking get(long id);

    void add(Booking booking);

}

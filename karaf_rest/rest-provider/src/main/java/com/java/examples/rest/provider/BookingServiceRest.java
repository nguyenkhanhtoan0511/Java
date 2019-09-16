package com.java.examples.rest.provider;

import com.java.examples.rest.api.Booking;
import com.java.examples.rest.api.BookingService;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.awt.print.Book;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Path("/")
public class BookingServiceRest implements BookingService {

    private final Map<Long, Booking> bookings = new HashMap<>();

    // test func
    public void init() {
        Booking book1 = new Booking((long)1, "abc", "xyz");
        Booking book2 = new Booking((long)2, "abc", "xyz");
        Booking book3 = new Booking((long)3, "abc", "xyz");
        Booking book4 = new Booking((long)4, "abc", "xyz");
        Booking book5 = new Booking((long)5, "abc", "xyz");
        Booking book6 = new Booking((long)6, "abc", "xyz");

        add( book1);
        add( book2);
        add( book3);
        add( book4);
        add( book5);
        add( book6);

        System.out.println("Init BookingServiceRest successfully.");
    }

    // test func
    public void destroy() {
        System.out.println("Destroy BookingServiceRest successfully.");
    }

    @Override
    @Path("/")
    @Produces("application/json")
    @GET
    public Collection<Booking> list() {
        return bookings.values();
    }

    @Override
    @Path("/{id}")
    @Produces("application/json")
    @GET
    public Booking get(@PathParam("id") Long id) {
        return bookings.get(id);
    }

    @Override
    @Path("/")
    @Consumes("application/json")
    @POST
    public void add(Booking booking) {
        bookings.put(booking.getId(), booking);
    }

    @Override
    @Path("/")
    @Consumes("application/json")
    @PUT
    public void update(Booking booking) {
        bookings.remove(booking.getId());
        bookings.put(booking.getId(), booking);
    }

    @Override
    @Path("/{id}")
    @DELETE
    public void remove(@PathParam("id") Long id) {
        bookings.remove(id);
    }

}

package com.java.examples.rest.client.cxf;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.java.examples.rest.api.Booking;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.Option;
import org.apache.karaf.shell.api.action.lifecycle.Service;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Service
@Command(scope = "booking", name = "list", description = "List booking")
public class ListBookingCommand implements Action {

    @Option(name = "--url", description = "Location of the REST service", required = false, multiValued = false)
    String restLocation = "http://localhost:8181/cxf/booking/";

    @Override
    public Object execute() throws Exception {
        List providers = new ArrayList();
        providers.add(new JacksonJsonProvider());
        WebClient webClient = WebClient.create(restLocation, providers);

        List<Booking> bookings = (List<Booking>) webClient.accept(MediaType.APPLICATION_JSON).getCollection(Booking.class);
        for (Booking booking : bookings) {
            System.out.println(booking.getId() + " " + booking.getCustomer() + " " + booking.getFlight());
        }

        return null;
    }

}
package com.java.examples.rest.api;

public class Booking {

    private Long id;
    private String customer;
    private String flight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public Booking(long id, String customer, String flight) {
        this.id = id;
        this.customer = customer;
        this.flight = flight;
    }
}

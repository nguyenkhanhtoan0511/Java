package com.java.examples.client;

import com.java.examples.common.Booking;

public class Display {

    private ClientService clientService;

    private BookingDisplayThread thread;
    private boolean bookingThreadStarted = false;

    /**
     * This setter is used by Blueprint to inject the client service.
     */
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    /**
     * Init method used to start the thread.
     */
    public void init() {
        BookingDisplayThread thread = new BookingDisplayThread(clientService);
        thread.start();
    }

    /**
     * Destroy method used to stop the thread.
     */
    public void destroy() {
        thread.terminate();
    }

    /**
     * Very simple thread adding random booking and displaying the bookings on System.out every 5s.
     */
    private class BookingDisplayThread extends Thread {

        private ClientService clientService;
        private volatile boolean running = true;

        public BookingDisplayThread(ClientService clientService) {
            this.clientService = clientService;
        }

        @Override
        public void run() {
            while (running) {
                try {

                    // TODO test
                    Booking booking = new Booking("Khanh Toan", "1235125hda");
                    clientService.addBooking(booking);

                    System.out.println(displayBookings());
                    Thread.sleep(20000);
                } catch (Exception e) {
                    // nothing to do
                }
            }
        }

        private String displayBookings() {
            StringBuilder builder = new StringBuilder();
            for (Booking booking : clientService.bookings()) {
                builder.append(booking.getId()).append(" | ").append(booking.getCustomer()).append(" | ").append(booking.getFlight()).append("\n");
            }
            return builder.toString();
        }

        public void terminate() {
            running = false;
        }

    }

}
package com.thoughtworks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TicketBookingSystem {

    private static final Logger logger = Logger.getLogger(TicketBookingSystem.class.getName());

    static class BookingTask implements Runnable {
        private final int bookingId;

        BookingTask(int bookingId) {
            this.bookingId = bookingId;
        }

        @Override
        public void run() {
            logger.info("Booking " + bookingId + " received");

            System.out.println("Booking for " + bookingId + " received");
            simulateProcessing("Booking is processed for:" + bookingId);
            simulateProcessing("Ticket booking for " + bookingId + " completed");
        }

        private void simulateProcessing(String message) {
            try {
                Thread.sleep(1000);
                logger.info(message);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.log(Level.SEVERE, "Booking " + bookingId + " interrupted", e);

            }
        }
    }

    public static void main(String[] args) {
        int numberOfRequests = 5;
        int poolSize = 3;

        try (ExecutorService executorService = Executors.newFixedThreadPool(poolSize)) {
            logger.info("Submitting booking tasks to thread pool");
            for (int i = 0; i < numberOfRequests; i++)
                executorService.submit(new BookingTask(i));

            executorService.shutdown();
            logger.info("All booking requests submitted.");
        }
    }
}
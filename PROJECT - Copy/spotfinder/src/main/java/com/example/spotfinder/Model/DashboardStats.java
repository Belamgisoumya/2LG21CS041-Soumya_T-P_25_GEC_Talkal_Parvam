package com.example.spotfinder.Model;

public class DashboardStats {
    private int totalSpots;
    private int availableSpots;
    private int occupiedSpots;
    private int reservedSpots;

    // No-args constructor
    public DashboardStats() {
    }

    // All-args constructor
    public DashboardStats(int totalSpots, int availableSpots, int occupiedSpots, int reservedSpots) {
        this.totalSpots = totalSpots;
        this.availableSpots = availableSpots;
        this.occupiedSpots = occupiedSpots;
        this.reservedSpots = reservedSpots;
    }

    // Getters
    public int getTotalSpots() {
        return totalSpots;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public int getOccupiedSpots() {
        return occupiedSpots;
    }

    public int getReservedSpots() {
        return reservedSpots;
    }

    // Setters
    public void setTotalSpots(int totalSpots) {
        this.totalSpots = totalSpots;
    }

    public void setAvailableSpots(int availableSpots) {
        this.availableSpots = availableSpots;
    }

    public void setOccupiedSpots(int occupiedSpots) {
        this.occupiedSpots = occupiedSpots;
    }

    public void setReservedSpots(int reservedSpots) {
        this.reservedSpots = reservedSpots;
    }

    // toString() method for debugging/logging
    @Override
    public String toString() {
        return "DashboardStats{" +
                "totalSpots=" + totalSpots +
                ", availableSpots=" + availableSpots +
                ", occupiedSpots=" + occupiedSpots +
                ", reservedSpots=" + reservedSpots +
                '}';
    }
}
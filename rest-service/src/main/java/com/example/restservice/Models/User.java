package com.example.restservice.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class User {
    
    @Id
    @GeneratedValue
    private long BookingID;

    @Column
    private String Name;

    @Column
    private String Lastname;

    @Column
    private int Guests;

    @Column
    private int Roomnum;

    public long getBookingID() {
        return BookingID;
    }

    public String getName() {
        return Name;
    }

    public String getLastname() {
        return Lastname;
    }

    public int getGuests() {
        return Guests;
    }

    public int getRoomnum() {
        return Roomnum;
    }

    public void setBookingID(long bookingID) {
        BookingID = bookingID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setGuests(int guests) {
        Guests = guests;
    }

    public void setRoomnum(int roomnum) {
        Roomnum = roomnum;
    }

    
    
    

    
    
}

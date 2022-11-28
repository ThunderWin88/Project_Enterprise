package com.example.restservice.Models;

import java.sql.Date;

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
   private String Email;

   @Column
   private String Roomtype;

   @Column
   private int Roomnum;

   @Column
   private int guests;

   @Column
   private Date date;

public long getBookingID() {
    return BookingID;
}

public String getName() {
    return Name;
}

public String getEmail() {
    return Email;
}

public String getRoomtype() {
    return Roomtype;
}

public int getRoomnum() {
    return Roomnum;
}

public int getGuests() {
    return guests;
}

public Date getDate() {
    return date;
}

public void setBookingID(long bookingID) {
    BookingID = bookingID;
}

public void setName(String name) {
    Name = name;
}

public void setEmail(String email) {
    Email = email;
}

public void setRoomtype(String roomtype) {
    Roomtype = roomtype;
}

public void setRoomnum(int roomnum) {
    Roomnum = roomnum;
}

public void setGuests(int guests) {
    this.guests = guests;
}

public void setDate(Date date) {
    this.date = date;
}
    
    
    

    
    
}

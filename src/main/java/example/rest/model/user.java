package example.rest.model;


import java.sql.Date;
import java.util.List;

import example.rest.Repo.UserRepo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class user {
    
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
   private Date checkoutdate;

   @Column
   private String checkindate;



public long getBookingID() {
    return BookingID;
}



public void setBookingID(long bookingID) {
    BookingID = bookingID;
}



public String getName() {
    return Name;
}



public void setName(String name) {
    Name = name;
}



public String getEmail() {
    return Email;
}



public void setEmail(String email) {
    Email = email;
}



public String getRoomtype() {
    return Roomtype;
}



public void setRoomtype(String roomtype) {
    Roomtype = roomtype;
}



public int getRoomnum() {
    return Roomnum;
}



public void setRoomnum(int roomnum) {
    Roomnum = roomnum;
}



public int getGuests() {
    return guests;
}



public void setGuests(int guests) {
    this.guests = guests;
}



public Date getCheckoutdate() {
    return checkoutdate;
}



public void setCheckoutdate(Date checkoutdate) {
    this.checkoutdate = checkoutdate;
}



public String getCheckindate() {
    return checkindate;
}



public void setCheckindate(String checkindate) {
    this.checkindate = checkindate;
}



@Override
public String toString() {
    return "Name = "+ Name + "Email = "+Email;
}
    
    
    

    
    
}

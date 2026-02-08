package application.Hotel_Room_And_Pricing_System;


//Title : Hotel Room Allocation & Dynamic Pricing System

//====================
//CUSTOM EXCEPTIONS
//====================

//Checked Exception
class InvalidStayDurationException extends Exception{
 public InvalidStayDurationException(String msg) {
     super(msg);
 }
}

//Unchecked Exception
class RoomAllocationException extends RuntimeException{
 public RoomAllocationException(String msg) {
     super(msg);
 }
}

//======================
//ENUMS
//======================

enum RoomTypeEnum{
 STANDARD, DELUXE, SUITE
}

//======================
//INTERFACE
//======================

interface RoomService{
 double calculatePrice();
}

//======================
//ABSTRACTION BASE CLASS
//======================

abstract class Booking implements RoomService{

 private int bookingId;
 private static int counter = 0;
 private String guestName;
 private RoomTypeEnum roomType;
 private int noOfNights;

 protected Booking(String guestName, RoomTypeEnum roomType, int noOfNights) throws InvalidStayDurationException{
     this.bookingId = ++counter;
     this.guestName = guestName;
     this.roomType = roomType;
     setNoOfNights(noOfNights);
 }

 // Setter
 private void setNoOfNights(int noOfNights) throws InvalidStayDurationException{
     if (noOfNights <= 0) {
         throw new InvalidStayDurationException("Invalid Night Stay");
     }
     this.noOfNights = noOfNights;
 }

 // Getter
 protected int getNoOfNights() {
     return noOfNights;
 }

 // Common method
 protected double discountPrice(double amount) {
     return getNoOfNights() > 5 ? amount*0.90: amount;
 }

 @Override
 public String toString() {
     return "[Booking ID: "+ bookingId + ", Guest Name: "+ guestName + ", Room Type: "+ roomType + ", Nights: "+ noOfNights+"]";
 }
}

//======================
//STANDARD ROOM
//======================


class StandardRoom extends Booking{
 protected StandardRoom(String guestName, RoomTypeEnum roomType, int noOfNights) throws InvalidStayDurationException{
     super(guestName, roomType, noOfNights);
 }

 @Override
 public double calculatePrice() {
     int days = getNoOfNights();
     return discountPrice(days*2000);
 }
}

//======================
//DELUXE ROOM
//======================

class DeluxeRoom extends Booking{
 protected DeluxeRoom(String guestName, RoomTypeEnum roomType, int noOfNights) throws InvalidStayDurationException{
     super(guestName, roomType, noOfNights);
 }

 @Override
 public double calculatePrice() {
     int days = getNoOfNights();

     double price = days*4000;

     if (days > 5) {
         return discountPrice(price);
     }

     return price;
 }
}

//======================
//SUITE ROOM
//======================

class SuiteRoom extends Booking{
 protected SuiteRoom(String guestName, RoomTypeEnum roomType, int noOfNights) throws InvalidStayDurationException{
     super(guestName, roomType, noOfNights);
 }

 @Override
 public double calculatePrice() {
     int days = getNoOfNights();

     double price = days*7000;

     if (days > 5) {
         return discountPrice(price);
     }

     return price;
 }
}

//=========================
//MAIN APPLICATION TESTING
//=========================

public class App {
 public static void main(String[] args) {
     try {
         Booking b1 = new StandardRoom("Saran Sarkar", RoomTypeEnum.STANDARD, 6);

         System.out.println(b1);
         System.out.println("Total Bill: " + b1.calculatePrice());

         Booking b2 = new SuiteRoom("Rahul Kumar", RoomTypeEnum.SUITE, 8);

         System.out.println(b2);
         System.out.println("Total Bill: " + b2.calculatePrice());

     }
     catch (InvalidStayDurationException e) {
         System.out.println("Exception: "+ e.getMessage());
     }
 }
}


package application.Vehicle_Rental_System;


//VEHICLE RENTAL BILLING SYSTEM

//=======================
//Custom Exceptions
//=======================

//Checked Exception
class RentalPeriodExceededException extends Exception {
 public RentalPeriodExceededException(String msg) {
     super(msg);
 }
}

//Unchecked Exception
class InvalidRentalException extends RuntimeException{
 public InvalidRentalException(String msg) {
     super(msg);
 }
}

//=======================
//Abstraction
//=======================

interface RentalService{
 int calculateCost();
}


//=======================
//Abstract Base Class
//=======================

abstract class Rental implements RentalService{

 private int rentalID;
 private String name;
 protected int days;


 public Rental(int rentalID, String name, int days) throws RentalPeriodExceededException{

     if (name == null || name.isEmpty()) {
         throw new InvalidRentalException("Customer name cannot be empty");
     }

     this.rentalID = rentalID;
     this.name = name;
     setDays(days);
 }

 protected abstract String getType();

 protected abstract void setDays(int days) throws RentalPeriodExceededException;

 protected int getDays() {
     return days;
 }

 @Override
 public String toString() {
     return "RentalId: "+ rentalID +", Name: " + name + ", Vechile Type: " +getType() + ", Days: "+ days;
 }
}

//=======================
//BIKE Rental
//=======================

class BikeRental extends Rental{

 private static final int RATE_PER_DAY = 300;
 private static final int MAX_DAYS = 7;

 public BikeRental(int rentalID, String name, int days) throws RentalPeriodExceededException{
     super(rentalID, name, days);
 }

 @Override
 protected String getType() {
     return "BIKE";
 }

 protected void setDays(int days) throws RentalPeriodExceededException{
     if (days <= 0) {
         throw new InvalidRentalException("Days must be positive");
     }
     if (days > MAX_DAYS) {
         throw new RentalPeriodExceededException("Maximum limit reched.");
     }
     this.days = days;
 }

 @Override
 public int calculateCost() {
     int days = getDays();
     return days * RATE_PER_DAY;
 }
}

//=======================
//CAR Rental
//=======================

class CarRental extends Rental{

 private static final int RATE_PER_DAY = 1000;
 private static final int MAX_DAYS = 15;

 public CarRental(int rentalID, String name, int days) throws RentalPeriodExceededException{
     super(rentalID, name, days);
 }

 @Override
 protected String getType() {
     return "CAR";
 }

 protected void setDays(int days) throws RentalPeriodExceededException{
     if (days <= 0) {
         throw new InvalidRentalException("Days must be positive");
     }
     if (days > MAX_DAYS) {
         throw new RentalPeriodExceededException("Maximum limit reched.");
     }
     this.days = days;
 }

 @Override
 public int calculateCost() {
     int days = getDays();
     return days * RATE_PER_DAY;
 }
}



//=======================
//Application Entry Point
//=======================

class App{
 public static void main(String[] args) {
     try {
         Rental bike = new BikeRental(1, "Saran Sarkar", 7);
         Rental car = new CarRental(2, "Rahul Kumar", 3);

         System.out.println(bike);
         System.out.println("Total Cost for Bike: " + bike.calculateCost());

         System.out.println(car);
         System.out.println("Total Cost for Car: " + car.calculateCost());
     }
     catch(RentalPeriodExceededException e) {
         System.out.println("Exception: "+ e.getMessage());
     }
     
 }
}


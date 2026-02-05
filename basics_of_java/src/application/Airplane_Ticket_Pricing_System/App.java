package application.Airplane_Ticket_Pricing_System;


//=============================
//ENUMS (Safer than Strings)
//=============================

enum PassengerType{
 ADULT, SENIOR, CHILD
}

enum TravelClass{
 ECONOMY, BUSINESS
}


//=============================
//CUSTOM EXCEPTIONS
//=============================

//CHECKED EXCEPTION
class InvalidFareException extends Exception{
 public InvalidFareException(String msg) {
     super(msg);
 }
}

//UNCHECKED EXCEPTION
class CheckInNotAllowedException extends RuntimeException{
 public CheckInNotAllowedException(String msg) {
     super(msg);
 }
}

//=============================
//ABSTRACTION
//=============================

interface TicketService{
 double calculateFare();
 boolean canCheckIn();
}

//=============================
//ABSTRACT BASE CLASS
//=============================

abstract class Ticket implements TicketService{

 private final int ticketID;
 private final String passengerName;
 private final PassengerType passengerType;
 private final double baseFare;

 // CONSTRUCTOR
 protected Ticket(int ticketID, String passengerName, PassengerType passengerType, double baseFare) throws InvalidFareException {

     if (ticketID <= 0) {
         throw new InvalidFareException("Invalid Ticket ID");
     }
     if (passengerName == null || passengerName.isEmpty())  {
         throw new InvalidFareException("Invalid Passenger Name");
     }
     if (baseFare <= 0) {
     throw new InvalidFareException("Invalid Base Fare");
     }
     this.ticketID = ticketID;
     this.passengerName = passengerName;
     this.passengerType = passengerType;
     this.baseFare = baseFare;
 }

 // Getter
 protected PassengerType getPassengerType() {
     return passengerType;
 }

 // Getter
 protected double getBaseFare() {
     return baseFare;
 }

 // Common discount logic
 protected double applyPassengerDiscount(double fare) {
     switch (passengerType) {
         case SENIOR:
             return fare * 0.80; // 20% discount
         case CHILD: 
             return fare * 0.60; // 40% discount
         default:
             return fare; // no discount
     }
 }

 protected abstract TravelClass getTravelClass();

 @Override
 public boolean canCheckIn() {
     return calculateFare() > 0;
 }


 @Override
 public String toString() {
     return "[Ticket ID: "+ ticketID + ", Passenger Name: "+ passengerName + ", Passenger Type: "+ passengerType + ", Travel Class: "+ getTravelClass() + ", Final Fare: " + calculateFare() + "]";
 }
}

class EconomyTicket extends Ticket {

 // CONSTRUCTOR
 public EconomyTicket(int ticketID, String passengerName, PassengerType passengerType) throws InvalidFareException {
     super(ticketID, passengerName, passengerType, 5000); 
 }

 @Override
 public double calculateFare() {

     double fare = getBaseFare();
     fare = applyPassengerDiscount(fare);

     if (fare <= 0) {
         throw new CheckInNotAllowedException("Invalid Final Fare");
     }

     return fare;
 }

 @Override
 protected TravelClass getTravelClass() {
     return TravelClass.ECONOMY;
 }

}

class BusinessTicket extends Ticket {

 // CONSTRUCTOR
 public BusinessTicket(int ticketID, String passengerName, PassengerType passengerType) throws InvalidFareException {
     super(ticketID, passengerName, passengerType, 5000); 
 }

 @Override
 public double calculateFare() {
     
     double fare = getBaseFare() * 0.5; // 50% surcharge;
     fare = applyPassengerDiscount(fare);

     if (fare <= 0) {
         throw new CheckInNotAllowedException("Invalid Final Fare");
     }

     return fare;
 }

 @Override
 protected TravelClass getTravelClass() {
     return TravelClass.BUSINESS;
 }
}

//=============================
//APPLICATION (TEST)
//=============================

class App{
 public static void main(String[] args) {
     try{
         Ticket t1 = new EconomyTicket(1, "Saran Sarkar", PassengerType.ADULT);
         Ticket t2 = new EconomyTicket(2, "Anishka Das", PassengerType.SENIOR);
         Ticket t3 = new BusinessTicket(3, "Arunima Bhatt", PassengerType.CHILD);

         System.out.println(t1);
         System.out.println("Check-in allowed: " + t1.canCheckIn());

         System.out.println(t2);
         System.out.println("Check-in allowed: " + t2.canCheckIn());

         System.out.println(t3);
         System.out.println("Check-in allowed: " + t3.canCheckIn());
     }
     catch(InvalidFareException e) {
         System.out.println("Error: "+ e.getMessage());
     }
 }
}

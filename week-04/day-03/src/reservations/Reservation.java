package reservations;

import java.util.Random;

public class Reservation implements Reservationy {

  public static void main(String[] args) {
    printReservations();
  }

  private String bookingId;
  private String day;
  private Random rand = new Random();

  public Reservation() {
    bookingId = randomId();
    day = randomDay();
  }

  @Override
  public String getDowBooking() {
    return day;
  }

  @Override
  public String getCodeBooking() {
    return bookingId;
  }

  private String randomDay() {
    String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    return days[rand.nextInt(7)];
  }

  private String randomId() {
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
    StringBuilder randomId = new StringBuilder();
    for (int i = 0; i < 8; i++) {
      randomId.append(abc.charAt(rand.nextInt(abc.length())));
    }
    return randomId.toString().toUpperCase();
  }

  private static void printReservations() {
    int numOfReservations = 5;
    for (int i = 0; i < numOfReservations; i++) {
      Reservation reservation = (new Reservation());
      System.out.println("Booking# " + reservation.getCodeBooking() + " for " + reservation.getDowBooking());
    }
  }
}

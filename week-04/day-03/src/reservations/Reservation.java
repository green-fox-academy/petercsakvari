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
    int index = rand.nextInt(7);
    return days[index];
  }

  private String randomId() {
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < 8; i++) {
      builder.append(abc.charAt(rand.nextInt(abc.length())));
    }
    return builder.toString().toUpperCase();
  }

  private static void printReservations() {
    int numOfReservations = 5;
    for (int i = 0; i < numOfReservations; i++) {
      Reservation reservation = (new Reservation());
      System.out.println("Booking# " + reservation.getCodeBooking() + " for " + reservation.getDowBooking());
    }
  }
}

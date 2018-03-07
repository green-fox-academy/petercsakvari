package reservations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy {

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

  private static List<Reservation> createReservations() {
    List<Reservation> reservations = new ArrayList<>();
    int numOfReservations = 5;
    for (int i = 0; i < numOfReservations; i++) {
      reservations.add(new Reservation());
    }
    return reservations;
  }

  public static void main(String[] args) {

    for (Reservation reservation : createReservations()) {
      System.out.println("Booking# " + reservation.getCodeBooking() + " for " + reservation.getDowBooking());

    }
  }
}

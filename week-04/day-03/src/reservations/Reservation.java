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

  public static void main(String[] args) {

    List<Reservation> reservations = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
      reservations.add(new Reservation());
    }

    for (Reservation reservation:reservations) {
      System.out.println("Booking# " + reservation.getCodeBooking() + " for " + reservation.getDowBooking());
    }
  }
}

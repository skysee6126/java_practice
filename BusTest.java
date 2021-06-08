public class BusTest {
  public static void main(String[] args) {
    Bus bus = new Bus();
    bus.run();
    bus.klaxon();

    Car car = new Car();
    car.run();
    // car.klaxon();
  }
}

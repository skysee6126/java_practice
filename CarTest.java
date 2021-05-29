public class CarTest {
  public static void main(String[] args) {
    Car c1 = new Car();
    Car c2 = new Car();

    c1.name = "Firecar";
    c1.number = 1234;

    c1.name = "Ambulance";
    c1.number = 1111;

    System.out.println(c1.name);
    System.out.println(c1.number);
    System.out.println(c2.name);
    System.out.println(c2.number);
  }

}

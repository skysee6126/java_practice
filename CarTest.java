public class CarTest {
  public static void main(String[] args) { // 리턴타입, 메소드명(매개변수 등) {구현}
    Car c1 = new Car("Firecar");
    Car c2 = new Car("Ambulance");

    c1.name = "police car";
    c1.number = 1234;

    c2.name = "Ambulance";
    c2.number = 1111;

    System.out.println(c1.name);
    System.out.println(c1.number);
    System.out.println(c2.name);
    System.out.println(c2.number);
  }

}

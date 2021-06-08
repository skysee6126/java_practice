public class Bus extends Car {
  public Bus() {
    super("Bus"); // automatically callout parents constructor
    System.out.println("Basic Constructor");
  }

  public void klaxon() {
    System.out.println("bipbip");
  }
}

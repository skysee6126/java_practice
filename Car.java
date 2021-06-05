public class Car {
  String name;
  int number;

  public Car(String name) {
    this.name = name;
  }

  public Car() {
    // this.name = "No name";
    // this.number = 0;
    this("No name", 0);

  }

  public Car(String name, int number) {
    this.name = name;
    this.number = number;
  }

  public void run() {
    System.out.println("Running");
  }

}

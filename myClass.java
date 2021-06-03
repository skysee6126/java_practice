import javax.print.event.PrintJobListener;

public class myClass {
  public void method1() {
    // void 리턴타입이 없음
    System.out.println("Method 1");
  }

  public void method2(int x) {
    System.out.println(x);
  }

  public int method3() {
    System.out.println("Action method3");
    return 10;
  }

  public void method4(int x, int y) {
    System.out.println(x + y);
  }

  public int method5(int y) {
    System.out.println("Method5");
    return y * 2;
  }

  // method overload: different type and number
  public int plus(int x, int y) {
    return x + y;
  }

  public int plus(int x, int y, int z) {
    return x + y + z;
  }

  public String plus(String x, String y) {
    return x + y;
  }

}

public class enumTest {
  public static final String MALE = "MALE";
  public static final String FEMALE = "FEMALE";

  public static void main(String[] args) {
    String gender1;
    gender1 = enumTest.MALE;
    gender1 = enumTest.FEMALE;
    gender1 = "boy";

    Gender gender2;
    gender2 = Gender.MALE;
    gender2 = Gender.FEMALE;
    // gender2 = "boy";

  }
}

enum Gender {
  MALE, FEMALE;
}
package java;

public class StingExam {
  public static void main(String[] args) {
    //str1 & str2 have same instance(refer)
    String strl = "hello";
    String str2 = "hello";

    String str3 = new String("hello");
    String str4 = new String("hello");

    if (str1 == str2)
      System.out.println("srt1, str2 have same reference");
    
    if (str1 == str3)
      System.out.println("str1, str3 have same reference");

    if (str3 == str4)
      System.out.println("str3, str4 have same reference");

    if( str1.equals(str2) ){
            System.out.println("str1 and str2 have same value");
        }
        else{
            System.out.println("str1 and str2 have different value each other");
        }

    System.out.println(str1);
    System.out.println(str1.substring(3));
    System.out.println(str1);

    
  }
}
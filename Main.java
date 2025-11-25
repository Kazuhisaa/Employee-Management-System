package EMS;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    header.headerdesign();

    int choose;

    do {
      System.out.println("1. Login As Admin");
      System.out.println("2. Login As Employee");
      System.out.println("Enter a Number: ");
      choose = sc.nextInt();
      if (choose == 1) {
        System.out.println("Login as Admin");
      } else if (choose == 2) {
        System.out.println("login as Employee");
      } else {
        System.out.println("Invalid Input");
      }
    } while (choose != 2);
  }

}

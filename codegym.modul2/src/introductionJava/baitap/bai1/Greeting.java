package introductionJava.baitap.bai1;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String yourName;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name: ");
        yourName=scanner.next();
        System.out.println("Hello "+yourName);
    }
}

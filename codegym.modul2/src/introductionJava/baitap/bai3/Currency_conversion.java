package introductionJava.baitap.bai3;

import java.util.Scanner;

public class Currency_conversion {
    public static void main(String[] args) {
    Float currency,result;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input USD: ");
        currency=scanner.nextFloat();
        result=currency*23000;
        System.out.println("Output VND:");
        System.out.println(result);
    }
}

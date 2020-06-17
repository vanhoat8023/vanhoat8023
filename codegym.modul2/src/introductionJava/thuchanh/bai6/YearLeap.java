package introductionJava.thuchanh.bai6;

import java.util.Scanner;

public class YearLeap {
    public static void main(String[] args) {
        short year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter year: ");
        year=scanner.nextShort();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("Year is leap! ");
                }else System.out.println("Year is not leap!");
            }else System.out.println("Year is leap!");
        }
    }
}

package introductionJava.thuchanh.bai5;

import java.util.Scanner;

public class countDay {
    public static void main(String[] args) {
        int month;
        String day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("month is: ");
        month=scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day="31";
                break;
            case 2:
                day="29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day="30";
                break;
            default:
                day="";
        }
        System.out.println("day in month is: "+day);

    }
}

package introductionJava.baitap.bai2;

import java.util.Scanner;

public class NumberMovedToString {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        number = scanner.nextInt();
        String StrNumBer = String.valueOf(number);
        String result = " ";
        if (StrNumBer.length() < 1) {
            System.out.println("Input error!");
        } else if (StrNumBer.length() == 2) {
            if (number <= 20) {
                switch (StrNumBer) {
                    case "10":
                        result += "ten";
                        break;
                    case "11":
                        result += "eleven";
                        break;
                    case "12":
                        result += "twelve";
                        break;
                    case "13":
                        result += "thirteen";
                        break;
                    case "14":
                        result += "fourteen";
                        break;
                    case "15":
                        result += "fifteen";
                        break;
                    case "16":
                        result += "sixteen";
                        break;
                    case "17":
                        result += "seventeen";
                        break;
                    case "18":
                        result += "eighteen";
                        break;
                    case "19":
                        result += "nineteen";
                        break;
                    case "20":
                        result += "twenty";
                        break;

                }
            } else {
                switch (StrNumBer.charAt(StrNumBer.length() - 2)) {
                    case 3:
                        result += "thirty-";

                }
            }
        } else {
            for (int i = 0; i < StrNumBer.length(); i++) {
                String temp = String.valueOf(StrNumBer.charAt(i));
                switch (temp) {
                    case "1":
                        result += "one";
                        break;
                    case "2":
                        result += "two";
                        break;
                    case "3":
                        result += "three";
                        break;
                    case "4":
                        result += "for";
                        break;
                    case "5":
                        result += "fine";
                        break;
                    case "6":
                        result += "six";
                        break;
                    case "7":
                        result += "seven";
                        break;
                    case "8":
                        result += "eight";
                        break;
                    case "9":
                        result += "nice";
                        break;
                    default:
                        result += "";
                        break;
                }
            }
        }
        System.out.println(result);

    }
}

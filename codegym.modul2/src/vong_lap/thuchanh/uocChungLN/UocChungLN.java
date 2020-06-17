package vong_lap.thuchanh.uocChungLN;

import java.util.Scanner;

public class UocChungLN {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        a = scanner.nextInt();
        System.out.println("Input b: ");
        b = scanner.nextInt();
        if (a < 1 || b < 1) {
            System.out.println("a or b false!");
        } else {
            while (a != b) {
                if (a>b){
                    a=a-b;
                }else b=b-a;
            }
            System.out.println("UCLN is: "+a);
        }
    }
}

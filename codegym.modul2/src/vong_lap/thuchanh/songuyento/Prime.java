package vong_lap.thuchanh.songuyento;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1,count=0;
        System.out.println("Input number: ");
        number1=scanner.nextInt();
        if (number1<=1){
            System.out.println("import number false!");
        }else {
            for (int i = 2; i <=Math.pow(2,number1) ; i++) {
                if (number1%i==0){
                    count+=1;
                }
            }
        }
        if (count<1){
            System.out.println(number1+" is prime!");
        }else System.out.println(number1+" is not prime!");
    }
}

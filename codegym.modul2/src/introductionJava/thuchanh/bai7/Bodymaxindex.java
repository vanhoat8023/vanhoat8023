package introductionJava.thuchanh.bai7;

import java.util.Scanner;

public class Bodymaxindex {
    public static void main(String[] args) {
        Float wight,height;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter wight: ");
        wight=scanner.nextFloat();
        System.out.println("Enter height: ");
        height=scanner.nextFloat();
        Double BMI=wight/Math.pow(height,2);
        if (BMI<18.5){
            System.out.println("Underweight!");
        }else if (BMI<25){
            System.out.println("Normal!");
        }else if (BMI<30){
            System.out.println("Overweight!");
        }else System.out.println("Obese!");
    }
}

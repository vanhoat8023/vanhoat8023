package OOP.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }


}

class Ptb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input c: ");
        double c = scanner.nextDouble();
        QuadraticEquation Ptb2_1 = new QuadraticEquation(a, b, c);
        if (Ptb2_1.getDiscriminant() > 0) {
            System.out.print("phuong trinh co 2 nghiem!");
            System.out.print("x1: "+ Ptb2_1.getRoot1());
            System.out.print("x2: "+ Ptb2_1.getRoot2());
        }else if (Ptb2_1.getDiscriminant()==0){
            System.out.print("phuong trinh co nghiem kep,");
            System.out.print(" x1=x2: "+(-b/(2*a)));
        }else System.out.println("phuong trinh vo nghiem");
    }
}

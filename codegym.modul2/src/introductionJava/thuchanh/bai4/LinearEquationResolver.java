package introductionJava.thuchanh.bai4;


import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        float a,b;
        System.out.println("a: ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("a= ");
        a=scanner.nextFloat();
        System.out.println("b= ");
        b=scanner.nextFloat();
        if (a!=0){
            Float solution=-b/a;
            System.out.println("The solution is: %f!"+solution);
        }else {
            if (b==0) {
                System.out.println("The solution is all x");
            }else {
                System.out.println("No solution!");
            }
        }
    }
}

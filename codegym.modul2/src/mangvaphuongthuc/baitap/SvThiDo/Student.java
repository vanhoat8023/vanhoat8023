package mangvaphuongthuc.baitap.SvThiDo;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int elementStudent,result=0;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("input total student: ");
            elementStudent=scanner.nextInt();
            if (elementStudent>15){
                System.out.println("exceeding total student!");
            }
        }while (elementStudent<1||elementStudent>15);
        array=new int[elementStudent];
        for (int i = 0; i <elementStudent ; i++) {
            System.out.print("input element: ");
            array[i]=scanner.nextInt();
            if (array[i]>5){
                result+=1;
            }
        }
        System.out.print("total: "+result);
    }
}

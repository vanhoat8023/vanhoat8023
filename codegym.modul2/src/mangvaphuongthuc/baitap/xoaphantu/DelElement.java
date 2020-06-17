package mangvaphuongthuc.baitap.xoaphantu;

import java.util.Scanner;

public class DelElement {
    public static void main(String[] args) {
        int[] arrA;
        int[] arrB;
        int size,element,checkNum,temp=-1;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Enter size: ");
            size=scanner.nextInt();
            if (size>20||size<1){
                System.out.println("size false!");
            }
        }while (size>20||size<1);
        arrA=new int[size];
        for (int i = 0; i <arrA.length ; i++) {
            System.out.print("Enter element "+(i+1)+":");
            element=scanner.nextInt();
            arrA[i]=element;
        }
        for (int i = 0; i <arrA.length ; i++) {
            System.out.println(arrA[i]);
        }
        arrB=new int[size];
        System.out.println("Check number: ");
        checkNum=scanner.nextInt();
        for (int i = 0; i <arrA.length ; i++) {
            if (arrA[i]==checkNum){
                temp=i;
                break;
            }
            arrB[i]=arrA[i];
        }
        if (temp!=-1) {
            for (int i = (temp); i < arrA.length-1; i++) {
                arrB[i]=arrA[i+1];
            }
        }
        for (int i = 0; i <arrB.length ; i++) {
            System.out.println(arrB[i]);
        }
    }
}

package mangvaphuongthuc.thuchanh.daonguocmang;

import java.util.Scanner;

public class Daomang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size=scanner.nextInt();
            if (size>15){
                System.out.println("size does not exceed 15");
            }
        }while (size>15);
        array=new int[size];
        int i=0;
        while ( i<array.length){
            System.out.println("Enter element "+(i+1)+" : ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("Before array is:");
        for (int element:array
             ) {
            System.out.println(element+"\t");
        }
        for ( int j=0;j<array.length/2;j++) {
            int temp=array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.println("After array is: ");
        for (int m:array
             ) {
            System.out.println(m+"\t");
        }
    }
}

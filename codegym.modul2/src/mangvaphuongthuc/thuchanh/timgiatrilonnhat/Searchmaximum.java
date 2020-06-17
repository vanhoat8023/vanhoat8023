package mangvaphuongthuc.thuchanh.timgiatrilonnhat;

import java.util.Scanner;

public class Searchmaximum {
    public static void main(String[] args) {
        Float[] array;
        Scanner scanner=new Scanner(System.in);
        int size;
        do {
            System.out.println("Input size: ");
            size=scanner.nextInt();
            if (size>20){
                System.out.println("size exceeding!");
            }else if (size<1){
                System.out.println("size exceeding!");
            }
        }while (size>20||size<1);
        array=new Float[size];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Input element "+(i+1)+" : ");
            array[i]=scanner.nextFloat();
        }
        int j=0;
        Float temp=array[0];
        while (j<array.length){
            if (temp<array[j]){
                temp=array[j];
            }
            j++;
        }
        System.out.println("result: "+temp);
    }
}

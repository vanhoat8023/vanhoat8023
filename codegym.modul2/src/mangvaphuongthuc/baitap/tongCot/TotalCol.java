package mangvaphuongthuc.baitap.tongCot;

import java.util.Scanner;

public class TotalCol {
    public static void main(String[] args) {
        int col,row,result=0,element,x;
        int[][] array;
        Scanner scanner=new Scanner(System.in);
        System.out.print("input row: ");
        row=scanner.nextInt();
        System.out.print("input column: ");
        col=scanner.nextInt();
        array= new int[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print("input element row "+ (i+1) +", col "+(j+1)+" : ");
                element=scanner.nextInt();
                array[i][j]=element;
            }
        }
        System.out.print("Total of column: ");
        x=scanner.nextInt();
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if (j==(x-1)){
                    result+=array[i][j];
                }
            }
        }
        System.out.println("result col: "+result);
    }
}

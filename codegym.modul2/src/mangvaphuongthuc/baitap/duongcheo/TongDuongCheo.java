package mangvaphuongthuc.baitap.duongcheo;

import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Float[][] araay;
        int col_row;
        Float element,result=0F;
        Scanner scanner=new Scanner(System.in);
        System.out.print("input col_row: ");
        col_row=scanner.nextInt();
        araay=new Float[col_row][col_row];
        for (int i = 0; i <col_row ; i++) {
            for (int j = 0; j <col_row ; j++) {
                System.out.print("input element row "+(i+1)+", col "+(j+1)+": ");
                element=scanner.nextFloat();
                araay[col_row][col_row]=element;
            }
        }
        for (int i = 0; i <col_row ; i++) {
            result+=araay[i][i];
        }
        System.out.println("result: "+result);
    }
}

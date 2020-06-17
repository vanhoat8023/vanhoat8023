package vong_lap.baitap.SongTo;

import java.util.Scanner;

public class soNgTo20 {
    public static void main(String[] args) {
        int amount, count = 1, temp = 2, x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("số lượng số nguyên tố cần xuất ra màn hình: ");
        amount = scanner.nextInt();
        while (count <= amount) {
            for (int i = 2; i <= Math.sqrt(temp); i++) {
                if (temp % i == 0) {
                    x += 1;
                }
            }
            if (x < 1) {
                System.out.println(temp);
                count++;
                x=0;
            }
            temp+=1;
        }
    }
}

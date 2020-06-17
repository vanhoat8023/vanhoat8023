package mangvaphuongthuc.baitap.xoaphantu;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 6, 1, 0};
        Scanner arr = new Scanner(System.in);
        System.out.print("Enter numb:");
        int numb = arr.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numb) {
                for (int j = i; j < array.length - 1; j++) {
                    if (array[j] == numb) {
                        array[j] = array[j + 1];
                    }
                    break;
                }
            }
            System.out.print("Property list: ");
            System.out.println(Arrays.toString(array));
        }
    }
}

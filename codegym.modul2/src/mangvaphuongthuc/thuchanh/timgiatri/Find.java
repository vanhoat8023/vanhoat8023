package mangvaphuongthuc.thuchanh.timgiatri;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        String[] array={"nhung","trang","tuan","hoat"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input name student: ");
        String name=scanner.next();
        Boolean check=false;
        for (String x:array
             ) {
            if (x==name.toLowerCase()){
                check=true;
            }
        }
        if (check){
            System.out.println("Name have on the list!");
        }else System.out.println("Name haven't on the list!");
    }
}

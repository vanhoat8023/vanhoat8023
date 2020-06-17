package mangvaphuongthuc.baitap.demSoKyTu;

import java.util.Scanner;

public class TemplateCharacter {
    public static void main(String[] args) {
        String a="asdscfuaidhswdcb";
        String x;
        int result=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("x: ");
        x=scanner.next();
        for (int i = 0; i <a.length() ; i++) {
            if (a.charAt(i)==x.charAt(0)){
                result+=1;
            }
        }
        System.out.println("result=: "+result);
    }
}

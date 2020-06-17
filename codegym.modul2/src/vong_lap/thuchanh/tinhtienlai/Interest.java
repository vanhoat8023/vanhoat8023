package vong_lap.thuchanh.tinhtienlai;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Float laiSuat;
        float soTien;
        int soThang;
        Scanner scanner=new Scanner(System.in);
        System.out.println("lai suat ngan hang (theo nam): ");
        laiSuat=scanner.nextFloat();
        System.out.println("so thang ban muon gui: ");
        soThang=scanner.nextInt();
        System.out.println("so tien ban dem di gui: ");
        soTien=scanner.nextInt();
        for (int i = 0; i <soThang ; i++) {
            soTien=soTien+soTien*(laiSuat/12)/100;
        }
        System.out.println("so tien nhan sau "+soThang+"thang la "+ soTien);
    }
}

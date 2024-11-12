
    package buoi7;

import java.util.Scanner;

public class nhapdiem {
    public static float truongTrinhNhapDiem(int n)
    {

        Scanner sc = new Scanner(System.in);
        float diem = 0;
        while (true) {
            try {
                System.out.println("Nhap diem: ");
                diem = Float.parseFloat(sc.nextLine());
                if (diem>=0 && diem<=10)
                break;
                else
                {
                    System.out.println("Diem nam trong khoang tu 0 - 10, hay nhap lai");
                }
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Du lieu khong hop le, diem nam trong khoang tu 0 - 10, hay nhap lai!");
            
            }
        }
        return diem;
    }
    public static void main(String[] args) {
        System.out.println("Diem vua nhap la: " +truongTrinhNhapDiem(0));
    }
}


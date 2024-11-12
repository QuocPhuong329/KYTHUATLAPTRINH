package buoi7;
import java.util.Scanner;
public class BaiTap20 {
   
public static  float nhapDiem() {
    Scanner sc = new Scanner(System.in);
   float diem =0;
while (true) {
    try {
        System.out.println ("\n Nhập điểm: ");

    diem = Float.parseFloat(sc.nextLine());
    if (diem >= 0 && diem <= 10)
     break;
    else {
        System.out.println("ĐIểm nằm trong khoangt từ 0-10,hãy nhập lại !!!");
    }

    } catch (Exception ex) {
        // TODO: handle exception
        System.out.println("Dữ liệu không hợp lệ,hãy nhập lại !!!");
    }
   
}
   return diem;
}
public static void main(String[] args) {
    float diem = nhapDiem();
    System.out.println("Điểm bạn đã nhập: " + diem);
}
}

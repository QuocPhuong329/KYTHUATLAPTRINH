package NguyenQuocPhuong;

        public class phuong107435 {
            public static void main(String[] args) {
            // KHỞI TẠO MẢNG HAI CHIỀU KHÔNG ĐỀU
                int[][] a = {
                    {1, 3},
                    {6, 5, 9},
                    {4, 6}
                };
        
           // SỬ DỤNG VÒNG LẶP ĐỂ DUYỆT CÁC PHẦN TỬ CỦA MẢNG
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        // In ra từng phần tử của mảngIN RA TỪNG PHẦN TỬ CỦA MẢNG
                        System.out.print(a[i][j] + " ");
                    }
                    //XUỐNG DÒNG SAU KHI IN XONG MỘT HÀNG
                     System.out.println();
                }
            }
        }
    


        public class phuong107435 {
            public static void main(String[] args) {
                // Khởi tạo mảng b
                int[] b = {3, 5, 6, 8, 10, 14, 17, 19, 20};
        
                // GỌI PHƯƠNG THỨC hienThiMang ĐỂ HIỂN THỊ CÁC PHẦN TỬ CỦA MẢNG b
                hienThiMang(b);
            }
        
            // PHƯƠNG THỨC hienThiMang ĐỂ HIỂN THỊ CÁC PHẦN TỬ CỦA MẢNG B
            public static void hienThiMang(int b[]) {
                // DUYỆT QUA TỪNG PHẦN TỬ TRONG MẢNG B VÀ IN RA
                for (int i = 0; i < b.length; i++) {
                    System.out.print(b[i] + " ");
                }
                // XUỐNG DÒNG SAU KHI HIỂN THỊ TOÀN BỘ MẢNG
                System.out.println();
            }
        }


        
        public class phuong107435 {
            public static void main(String[] args) {
                // KHỞI TẠO BẢNG b
                int[] b = {3, 5, 6, 8, 10, 14, 17, 19, 20};
        
                // GỌI PHƯƠNG THỨC timMax ĐỂ TÌM GIÁ TRỊ LỚN NHẤT VÀ IN KẾT QUẢ
                int maxValue = timMax(b);
                System.out.println("Giá trị lớn nhất trong mảng là: " + maxValue);
            }
        
            // PHƯƠNG THỨC timMax ĐỂ TÌM GIÁ TRỊ LỚN NHẤT TRONG MẢNG b
            public static int timMax(int b[]) {
                int max = b[0]; // KHỞI TẠO max LÀ PHẦN TỬ ĐẦU TIÊN CỦA MẢNG
        
                //DUYỆT QUA CÁC PHẦ TỬ TRONG MẢNG ĐỂ TÌM GIÁ TRỊ LỚN NHẤT
                for (int i = 1; i < b.length; i++) {
                    if (b[i] > max) {
                        max = b[i]; //CẬP NHẬT max NẾU TÌM THẤY PHẦN TỬ LỚN HƠN
                    }
                }
                return max; // TRẢ VỀ GIÁ TRỊ LỚN NHẤT
            }
        }



        public class phuong107435 {
            public static void main(String[] args) {
                // Khởi tạo mảng b
                int[] b = {3, 5, 6, 8, 10, 14, 17, 19, 20};
        
                // Gọi phương thức tinhTongChan để tính tổng các giá trị chẵn lớn hơn 6 và in kết quả
                int tongChan = tinhTongChan(b);
                System.out.println("Tổng các giá trị chẵn lớn hơn 6 trong mảng là: " + tongChan);
            }
        
            // Phương thức tinhTongChan để tính tổng các giá trị chẵn lớn hơn 6 trong mảng b
            public static int tinhTongChan(int b[]) {
                int tong = 0; // Khởi tạo biến tổng
        
                // Duyệt qua các phần tử trong mảng
                for (int i = 0; i < b.length; i++) {
                    // Kiểm tra nếu phần tử là số chẵn và lớn hơn 6
                    if (b[i] > 6 && b[i] % 2 == 0) {
                        tong += b[i]; // Cộng phần tử vào tổng
                    }
                }
                return tong; // Trả về tổng
            }
        }

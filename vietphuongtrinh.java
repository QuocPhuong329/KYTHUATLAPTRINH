package buoi4;

public class vietphuongtrinh {

    public static void main(String[] args) {
 int c[][][] = {{{5,2,3},{4,5,6,8},{7,7}},{{5,6,7,3},{8,9}}};
  System.out.println("cac phan tu cua mang c la:");
    for (int i = 0; i < c.length; i++) {
        for (int j = 0; j < c[i].length; j++) {
            for (int k = 0; k < c[i][j].length; k++) {
                System.out.println("c[" + i + "][" + j + "][" + k + "] = " + c[i][j][k]);
            }
        }
    }
}
}

    
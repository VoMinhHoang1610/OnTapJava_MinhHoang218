package Testing;

import java.util.Scanner;
import Class.QLCB;

public class Test {

    public static void main(String[] args) {
        // đặt biến kèm 3 số cuối của MSV
        Scanner sc_218 = new Scanner(System.in);

        QLCB qlcb_218 = new QLCB();

        qlcb_218.nhapDanhSach(sc_218);

        System.out.print("Nhap vao ho ten can tim kiem: ");
        String name_218 = sc_218.nextLine();

        qlcb_218.timKiemCanBo(name_218);

        // huy sc
        sc_218.close();
    }
}

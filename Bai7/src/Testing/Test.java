package Testing;

import java.util.Scanner;
import Class.QLHS;

public class Test {

    public static void main(String[] args) {
        Scanner sc_218 = new Scanner(System.in);

        QLHS list_218 = new QLHS();

        // Nhập danh sách học sinh
        list_218.nhapDanhSach(sc_218);

        // Tìm theo năm sinh và quê quán
        System.out.println("\nNhung hoc sinh sinh nam 1985 va que Thai Nguyen la:");
        list_218.timKiemThongTin(1985, "Thai Nguyen");

        // Tìm theo lớp
        System.out.println("\nNhung hoc sinh hoc lop 10A1 la:");
        list_218.timKiemThongTin("10A1");

        sc_218.close();
    }
}

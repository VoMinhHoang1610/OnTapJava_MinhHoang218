package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class QLHS {
    private ArrayList<HocSinh> dshs_218;

    public QLHS() {
        dshs_218 = new ArrayList<HocSinh>(10);
    }

    // them 1 hoc sinh
    public void themHS(HocSinh hs_218) {
        dshs_218.add(hs_218);
    }

    // nhap danh sach hoc sinh
    public void nhapDanhSach(Scanner sc_218) {
        HocSinh hs_218;

        System.out.print("Nhap vao so hoc sinh: ");
        int soHS_218 = sc_218.nextInt();
        sc_218.nextLine();

        System.out.println("Nhap vao thong tin cho tung hoc sinh:");
        for (int i_218 = 0; i_218 < soHS_218; i_218++) {
            System.out.println("Hoc sinh thu " + (i_218 + 1) + " la:");
            hs_218 = new HocSinh();
            hs_218.nhapThongTin(sc_218);
            themHS(hs_218);
        }
    }

    // hien thi danh sach
    public void hienThiDanhSach() {
        int n_218 = dshs_218.size();

        for (int i_218 = 0; i_218 < n_218; i_218++) {
            System.out.println("Hoc sinh thu " + (i_218 + 1) + " la:");
            dshs_218.get(i_218).hienThiThongTin();
        }
    }

    // ham tim kiem thong tin theo nam va que
    public void timKiemThongTin(int nam_218, String que_218) {
        Calendar cal_218 = Calendar.getInstance();

        for (HocSinh hs_218 : dshs_218) {
            Date ngSinh_218 = hs_218.getNgaySinh();
            if (ngSinh_218 == null) continue;
            cal_218.setTime(ngSinh_218);
            int namSinh_218 = cal_218.get(Calendar.YEAR);

            if (namSinh_218 == nam_218 && que_218.equals(hs_218.getQueQuan())) {
                hs_218.hienThiThongTin();
            }
        }
    }

    // ham tim kiem thong tin theo lop
    public void timKiemThongTin(String lop_218) {
        for (HocSinh hs_218 : dshs_218) {
            if (lop_218.equals(hs_218.getLop())) {
                hs_218.hienThiThongTin();
            }
        }
    }
}

package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
// thuoc tinh
private String bac_218;

// phuong thuc
// ham khoi tao khong doi so
public CongNhan() {

}

// ham khoi tao co doi so
public CongNhan(String hoten_218, String ngaySinh_218, 
		        String gioiTinh_218, String diaChi_218, String bac_218) {
	super(hoten_218, ngaySinh_218, gioiTinh_218, diaChi_218);
	this.bac_218 = bac_218;
}

// ham nhap
public void nhapThongTin(Scanner sc_218) {
	super.nhapThongTin(sc_218);
	System.out.print("\tNhap bac: ");
	bac_218 = sc_218.nextLine();
}

// ham hien thi thong tin
public void hienThiThongTin() {
	super.hienThiThongTin();
	System.out.println("\tBac: " + bac_218);
}
}
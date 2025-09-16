package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
// thuoc tinh
private String congViec_218;

// phuong thuc
// ham khoi tao khong doi so
public NhanVien() {

}

// ham khoi tao co doi so
public NhanVien(String hoten_218, String ngaySinh_218, String gioiTinh_218, 
		String diaChi_218, String congViec_218) {
	super(hoten_218, ngaySinh_218, gioiTinh_218, diaChi_218);
	this.congViec_218 = congViec_218;
}

// ham nhap
public void nhapThongTin(Scanner sc_218) {
	super.nhapThongTin(sc_218);
	System.out.print("\tNhap cong viec: ");
	congViec_218 = sc_218.nextLine();
}

// ham hien thi
public void hienThiThongTin() {
	super.hienThiThongTin();
	System.out.println("\tCong viec: " + congViec_218);
}
}
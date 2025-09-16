package Class;

import java.util.Scanner;

public class KySu extends CanBo {
// thuoc tinh
private String nganhDaoTao_218;
// phuong thuc
// ham khoi tao khong doi so
public KySu() {

}

// ham khoi tao co doi so
public KySu(String hoten_218, String ngaySinh_218, 
			String gioiTinh_218, String diaChi_218, 
						String nganhDaoTao_218) {
	super(hoten_218, ngaySinh_218, gioiTinh_218, diaChi_218);
	this.nganhDaoTao_218 = nganhDaoTao_218;
}

// ham nhap
public void nhapThongTin(Scanner sc_218) {
	super.nhapThongTin(sc_218);
	System.out.print("\tNhap nganh dao tao: ");
	nganhDaoTao_218 = sc_218.nextLine();
}

// ham hien thi
public void hienThiThongTin() {
	super.hienThiThongTin();
	System.out.println("\tNganh dao tao: " + nganhDaoTao_218);
}
}
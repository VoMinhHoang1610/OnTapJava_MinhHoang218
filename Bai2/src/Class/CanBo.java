package Class;

import java.util.Scanner;

public class CanBo {
// thuoc tinh
private String hoTen_218;
private String ngaySinh_218;
private String gioiTinh_218;
private String diaChi_218;
// phuong thuc
// ham khoi tao khong doi so
public CanBo() {

}
// ham khoi tao co doi so
public CanBo(String hoten_218, String ngaySinh_218, String gioiTinh_218, String diaChi_218) {
	this.hoTen_218 = hoten_218;
	this.ngaySinh_218 = ngaySinh_218;
	this.gioiTinh_218 = gioiTinh_218;
	this.diaChi_218 = diaChi_218;
}

// ham nhap
public void nhapThongTin(Scanner sc_218) {
	System.out.print("\tNhap ho ten: ");
	hoTen_218 = sc_218.nextLine();
	System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
	ngaySinh_218 = sc_218.nextLine();
	System.out.print("\tNhap gioi tinh: ");
	gioiTinh_218 = sc_218.nextLine();
	System.out.print("\tNhap dia chi: ");
	diaChi_218 = sc_218.nextLine();
}

// ham hien thi
public void hienThiThongTin() {
	System.out.println("\tHo ten: " + hoTen_218);
	System.out.println("\tNgay sinh: " + ngaySinh_218);
	System.out.println("\tGioi tinh: " + gioiTinh_218);
	System.out.println("\tDia chi: " + diaChi_218);
}

// ham lay thong tin ho ten
public String getHoTen() {
	return this.hoTen_218;
}


}
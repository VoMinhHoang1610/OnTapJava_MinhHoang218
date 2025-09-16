package Testing;

import java.util.Scanner;

import Class.TuyenSinh;

public class Test {

	public static void main(String[] args) {
		Scanner sc_218 = new Scanner(System.in);

		TuyenSinh dsTuyenSinh_218 = new TuyenSinh();

		System.out.println("Nhap vao danh sach thi sinh: ");
		dsTuyenSinh_218.nhapDanhSach(sc_218);

		System.out.println("Danh sach thi sinh du thi la:");
		dsTuyenSinh_218.hienThiDanhSach();

		System.out.print("Nhap so bao danh can tim: ");
		int soBaoDanh_218 = sc_218.nextInt();
		sc_218.nextLine();

		dsTuyenSinh_218.timKiemThiSinh(soBaoDanh_218);

		sc_218.close();
	}

}

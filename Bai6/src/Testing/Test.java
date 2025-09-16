package Testing;

import java.util.Scanner;

import Class.KhachSan;

public class Test {

	public static void main(String[] args) {
		Scanner sc_218 = new Scanner(System.in);

		KhachSan ql_218 = new KhachSan();

		ql_218.nhapDanhSach(sc_218);

		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd_218 = sc_218.nextInt();

		System.out.println("==> Tong tien la: " + ql_218.tinhTien(cmnd_218));

		sc_218.close();
	}

}

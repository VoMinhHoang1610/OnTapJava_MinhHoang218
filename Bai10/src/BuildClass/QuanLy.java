package BuildClass;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLy {
	// Thuoc tinh
	private ArrayList<BienLai> ds_218;
	// Phuong thuc
	// Ham khoi tao
	public QuanLy() {
		ds_218 = new ArrayList<BienLai>(10);
	}
	// Ham them bien lai vao danh sach
	public void themBienLai(BienLai bienLai_218) {
		ds_218.add(bienLai_218);
	}
	// Ham nhap danh sach
	public void nhapDanhSach(Scanner sc_218) {
		BienLai bienLai_218;
		System.out.print("Nhap vao so luong bien lai: ");
		int n_218 = sc_218.nextInt();
		sc_218.nextLine();
		System.out.println("Nhap vao danh sach bien lai:");
		for (int i_218 = 0; i_218 < n_218; i_218++) {
			System.out.println("Bien lai thu " + (i_218 + 1) + " la:");
			bienLai_218 = new BienLai();
			bienLai_218.nhapThongTin(sc_218);

			themBienLai(bienLai_218);
		}
	}

	// Ham hien thi danh sach
	public void hienThiDanhSach() {
		for (int i_218 = 0; i_218 < ds_218.size(); i_218++) {
			System.out.println("Bien lai thu " + (i_218 + 1) + " la:");
			ds_218.get(i_218).hienThiThongTin();
			System.out.println();
		}
	}
}

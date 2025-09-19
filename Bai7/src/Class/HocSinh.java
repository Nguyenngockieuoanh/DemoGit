package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {

	private String lop229;
	private String khoHoc229;
	private String kyHoc229;

	public HocSinh() {}

	public HocSinh(String hoTen229, String lop229, String khoaHoc229, String kyHoc229) {
		this.hoTen229 = hoTen229;
		this.lop229 = lop229;
		this.khoHoc229 = khoHoc229;
		this.kyHoc229 = kyHoc229;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop229 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc229 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc229 = sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop229);
		System.out.println("\tKhoa hoc: " + khoHoc229);
		System.out.println("\tKy hoc: " + kyHoc229);
	}

	public String getLop() {
		return lop229;
	}
}

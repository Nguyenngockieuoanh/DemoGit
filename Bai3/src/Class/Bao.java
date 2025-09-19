package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
	private String ngayPhatHanh229;

	public Bao() {}

	public Bao(String maTaiLieu229, String tenNXB229, int soBanPhatHanh229, String ngayPhatHanh229) {
		super(maTaiLieu229, tenNXB229, soBanPhatHanh229);
		this.ngayPhatHanh229 = ngayPhatHanh229;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh229 = sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh229);
	}
}

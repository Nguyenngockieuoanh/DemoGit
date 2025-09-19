package Class;
import java.util.Scanner;
public class Sach extends TaiLieu {
	private String tacGia229;
	private int soTrang229;

	public Sach() {}
        
	public Sach(String maTaiLieu229, String tenNXB229, int soBanPhatHanh229, String tacGia229, int soTrang229) {
		super(maTaiLieu229, tenNXB229, soBanPhatHanh229);
		this.tacGia229 = tacGia229;
		this.soTrang229 = soTrang229;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia229 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang229= sc.nextInt();
		sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia229);
		System.out.println("\tSo trang: " + soTrang229);
	}
}

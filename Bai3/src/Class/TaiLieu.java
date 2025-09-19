package Class;
import java.util.Scanner;
public class TaiLieu {
	private String maTaiLieu229;
	private String tenNXB229;
	private int soBanPhatHanh229;
        
	public TaiLieu() {}
        
	public TaiLieu(String maTaiLieu229, String tenNXB229, int soBanPhatHanh229) {
		this.maTaiLieu229 = maTaiLieu229;
		this.tenNXB229= tenNXB229;
		this.soBanPhatHanh229= soBanPhatHanh229;
	}
        
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu229 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB229 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh229 = sc.nextInt();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu229);
		System.out.println("\tTen nha xuat ban: " + tenNXB229);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh229);
	}
        
	public String getMaTaiLieu() {
		return maTaiLieu229;
	}
}

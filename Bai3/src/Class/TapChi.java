package Class;
import java.util.Scanner;
public class TapChi extends TaiLieu {
	private int soPhatHanh229;
	private int thangPhatHanh229;
        
	public TapChi() {}
        
	public TapChi(String maTaiLieu229, String tenNXB229, int soBanPhatHanh229, int soPhatHanh229, int thangPhatHanh229) {
		super(maTaiLieu229, tenNXB229, soBanPhatHanh229);
		this.soPhatHanh229 = soBanPhatHanh229;
		this.thangPhatHanh229 = thangPhatHanh229;
	}
        
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh229 = sc.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh229= sc.nextInt();
		sc.nextLine();
	}
        
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh229);
		System.out.println("\tThang phat hanh: " + thangPhatHanh229);
	}
}

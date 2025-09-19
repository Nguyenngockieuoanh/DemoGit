package Class;
import java.util.Scanner;

public class SinhVien {
	protected String hoTen229;
	protected String maSV229;
	protected String ngaySinh229;
	protected String lop229;
        
	public SinhVien() {}
        
	public SinhVien(String hoTen229, String maSV229, String ngaySinh229, String lop229) {
		this.hoTen229 = hoTen229;
		this.maSV229 = maSV229;
		this.ngaySinh229 = ngaySinh229;
		this.lop229 = lop229;
	}
        
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen229 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV229 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh229 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop229 = sc.nextLine();
	}
        
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen229);
		System.out.println("\tNgay sinh: " + ngaySinh229);
		System.out.println("\tMa sinh vien: " + maSV229);
		System.out.println("\tLop: " + lop229);
	}
}

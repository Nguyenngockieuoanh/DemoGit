package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoTen229;
	private Date ngaySinh229;
	private String ngheNghiep229;

	public Nguoi() {}

	public Nguoi(String hoTen229, Date ngaySinh229, String ngheNghiep229) {
		this.hoTen229 = hoTen229;
		this.ngaySinh229 = ngaySinh229;
		this.ngheNghiep229 = ngheNghiep229;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen229 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh229 = strToDate(strDate);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep229 = sc.nextLine();
	}
	private Date strToDate(String strDate) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}
		return date;
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen229);
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh229));
		System.out.println("\tNghe nghiep: " + ngheNghiep229);
	}
	private String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = sdf.format(date);
		return strDate;
	}
	public Date getNgaySinh() {
		return ngaySinh229;
	}
}

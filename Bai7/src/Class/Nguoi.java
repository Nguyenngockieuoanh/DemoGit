package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen229;
	protected Date ngaySinh229;
	protected String queQuan229;

	public Nguoi() {}

	public Nguoi(String hoTen229, Date ngaySinh229, String queQuan229) {
		this.hoTen229 = hoTen229;
		this.ngaySinh229 = ngaySinh229;
		this.queQuan229 = queQuan229;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen229 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh229= strToDate(strDate);

		System.out.print("\tNhap que quan: ");
		queQuan229 = sc.nextLine();
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
		System.out.println("\tNgay sinh: " + ngaySinh229);
		System.out.println("\tQue quan: " + queQuan229);
	}

	public String getQueQuan() {
		return queQuan229;
	}

	public Date getNgaySinh() {
		return ngaySinh229;
	}
}


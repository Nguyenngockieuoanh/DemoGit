/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec229;

    public NhanVien(){  }

    public NhanVien(String hoTen229,String ngaySinh229,String gioiTinh229,String diaChi229){
        super(hoTen229,ngaySinh229,gioiTinh229,diaChi229);
        this.congViec229=congViec229;
    }

    public void nhapThongTin(Scanner sc){
        super .nhapThongTin(sc);
        System.out.print("\tNhap cong viec: ");
        congViec229=sc.nextLine();
    }

    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tCong viec: "+congViec229);
    }
}



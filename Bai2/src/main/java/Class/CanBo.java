/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

public class CanBo {
    private String hoTen229;
    private String ngaySinh229;
    private String gioiTinh229;
    private String diaChi229;

    public CanBo(){  }

    public CanBo(String hoTen229, String ngaySinh229, String gioiTinh229, String diaChi229){
        this.hoTen229 = hoTen229;
        this.ngaySinh229=ngaySinh229;
        this.gioiTinh229=gioiTinh229;
        this.diaChi229=diaChi229;
    }

    public void nhapThongTin(Scanner sc){
        System.out.println("\tNhap ho ten: ");
        hoTen229=sc.nextLine();
        System.out.println("\tNhap ngay sinh (dd/MM/yy): ");
        ngaySinh229=sc.nextLine();
        System.out.println("\tNhap gioi tinh: ");
        gioiTinh229=sc.nextLine();
        System.out.println("\tNhap dia chi: ");
        diaChi229=sc.nextLine();
    }

    public void hienThiThongTin(){
        System.out.printf("\tHo ten: "+hoTen229);
        System.out.printf("\tNgay sinh: "+ngaySinh229);
        System.out.printf("\tGioi tinh: "+gioiTinh229);
        System.out.printf("\tDia chi: "+diaChi229);
    }

    public String getHoTen(){
        return this.hoTen229;
    }
}

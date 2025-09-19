/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac229;

    public CongNhan(){}

    public CongNhan(String hoTen229,String ngaySinh229,String gioiTinh229,String diaChi229,String nganhDaoTao229){
        super(hoTen229,ngaySinh229,gioiTinh229,diaChi229);
        this.bac229=bac229;
    }

    public void nhapThongTin(Scanner sc){
      super.nhapThongTin(sc);
      System.out.print("\tNhap bac: ");
      bac229=sc.nextLine();
    }
    
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tBac: "+bac229);
    }
}

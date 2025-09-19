/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1;

import Class.PhanSo;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo psTong = new PhanSo();
        
        System.out.println("Nhap vao phan so thu nhat: ");
        ps1.NhapPS(sc);
        System.out.println("Nhap vao phan so thu hai: ");
        ps2.NhapPS(sc);

        psTong = ps1.CongPS(ps2);

        System.out.println("\nPhan so thu nhat: ");
        ps1.Xuat();
        System.out.println("\nPhan so thu hai: ");
        ps2.Xuat();
        System.out.println("\nTong hai phan so la: ");
        psTong.Xuat();
        sc.close();
    }
}

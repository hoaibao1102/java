/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap45;

/**
 *
 * @author MSI PC
 */
public class test {
    public static void main(String[] args) {
        HangSanXuat hsx1 = new HangSanXuat("h1", "VIET NAM");
        HangSanXuat hsx2 = new HangSanXuat("h2", "MY");
        HangSanXuat hsx3 = new HangSanXuat("h3", "NHAT");
        
        PhuongTienDiChuyen pt1 = new MayBay(hsx2, "dau");
        PhuongTienDiChuyen pt2 = new XeOto(hsx1, "xang");
        PhuongTienDiChuyen pt3 = new XeDap(hsx3);
        
        System.out.println("Lay hang san xuat");
        System.out.println("hang san xuat pt1 la "+pt1.layTenHangSanXuat());
        System.out.println("");
        
        System.out.println("bat dau");
        pt1.batDau();
        System.out.println("");
        
        System.out.println("Lay van toc");
        System.out.println("pt1 mb "+pt1.layVanToc());
        System.out.println("pt2 oto "+ pt2.layVanToc());
        System.out.println("pt3 xedap "+ pt3.layVanToc());
        System.out.println("");
        
//        System.out.println("may bay" +pt1.cat);// không được vì tên bạn đặt là PhuongTienDiChuyen

        MayBay pt4 = new MayBay();
        System.out.println("may bay ");pt4.catCanh();
        System.out.println("may bay ");pt4.haCanh();

        
    }
}

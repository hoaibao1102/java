/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai38;

/**
 *
 * @author MSI PC
 */
public class test {

    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(13, 4, 2023);
        Ngay ngay2 = new Ngay(14, 6, 2021);
        Ngay ngay3 = new Ngay(12, 3, 2024);

        QuocGia qg1 = new QuocGia("VN", "VIETNAM");
        QuocGia qg2 = new QuocGia("USA", "HOA KY");
        QuocGia qg3 = new QuocGia("PA", "BA LAN");

        HangSanXuat hsx1 = new HangSanXuat("LAPTOPVN", qg1);
        HangSanXuat hsx2 = new HangSanXuat("MACBOOK", qg2);
        HangSanXuat hsx3 = new HangSanXuat("ASUS", qg3);
        
        MayTinh mt1 = new MayTinh(ngay1, hsx1, 1500 , 2);
        MayTinh mt2 = new MayTinh(ngay2, hsx2, 700 , 3);        
        MayTinh mt3 = new MayTinh(ngay3, hsx3, 1950  , 1);
        
        System.out.println("KIEM TRA SO SANH GIA MAY NAO RE HON");
        System.out.println("may tinh 1 re hon may tinh 2 "+ mt1.soSanhGiaBan(mt2));
        System.out.println("may tinh 1 re hon may tinh 3 "+mt1.soSanhGiaBan(mt3));
        
        System.out.println("lay ten quoc gia cua may tinh 1 "+ mt1.layTenQuocGia());
        System.out.println("lay ten quoc gia cua may tinh 2 "+ mt2.layTenQuocGia());
        System.out.println("lay ten quoc gia cua may tinh 3 "+ mt3.layTenQuocGia());
        
        
        
        

    }
}

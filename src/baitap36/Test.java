/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap36;

/**
 *
 * @author MSI PC
 */
public class Test {

    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(1, 3, 2023);
        Ngay ngay2 = new Ngay(31, 5, 2020);
        Ngay ngay3 = new Ngay(13, 7, 2021);

        hangSanXuat hsx1 = new hangSanXuat("A", "VIETNAM");
        hangSanXuat hsx2 = new hangSanXuat("B", "MY");
        hangSanXuat hsx3 = new hangSanXuat("D", "BALAN");

        BoPhim bophim1 = new BoPhim("chaydi", 2020, hsx1, 65000, ngay1);
        BoPhim bophim2 = new BoPhim("chayngay", 2022, hsx2, 85000, ngay2);
        BoPhim bophim3 = new BoPhim("dungdi", 2023, hsx3, 55000, ngay3);
        
        System.out.println("kiem tra gia ve cua bo phim 1 va bo phim 2");
        if(bophim1.kiemTraGiaVeReHon(bophim2)){
            System.out.println("gia ve bo phim 1 re hon bo phim 2");
        }else System.out.println("gia ve bo phim 1 dat hon bo phim 2");
        System.out.println("");
        System.out.println("so sanh gia 1 re hon 2: " + bophim1.kiemTraGiaVeReHon(bophim2));
        System.out.println("so sanh gia 1 re hon 3: " + bophim1.kiemTraGiaVeReHon(bophim3));
        
        System.out.println("ten hang san xuat cua bo phim 3: "+ bophim3.layTenHangSanXuat());
        
        System.out.println("gia cua bo phim 1 sau khi giam gia 10%: " + bophim1.giaSauKhuyenMai(10));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap35;

/**
 *
 * @author MSI PC
 */
public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(12,3,2034);
        Ngay ngay2 = new Ngay(23,4,2034);
        
        
        TacGia tg1 = new TacGia("bao",ngay1);
        TacGia tg2 = new TacGia("baole",ngay2);
        
        Sach s1 = new Sach("hello", 150000, 1234, tg1);
        Sach s2 = new Sach("helloworld ", 140000, 1234, tg2);
        
        s1.inTenSach();
        
        System.out.println("so sanh nam xuat ban can sach 1 va sach 2 " + s1.kiemTraCungNamXuatBan(s2));
        
        System.out.println("gia sau khi sach 1 giam 10% la " +s1.giaSauKhiGiam(10) );
    }
}

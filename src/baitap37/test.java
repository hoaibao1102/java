/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap37;

/**
 *
 * @author MSI PC
 */
public class test {

    public static void main(String[] args) {
        Ngay ngaysinh1 = new Ngay(13, 4, 2004);
        Ngay ngaysinh2 = new Ngay(11, 7, 2002);
        Ngay ngaysinh3 = new Ngay(13, 4, 2004);

        Lop lophoc1 = new Lop("A", "CONG NGHE");
        Lop lophoc2 = new Lop("B", "TRUYEN THONG");
        Lop lophoc3 = new Lop("C", "KE TOAN");

        SinhVien sv1 = new SinhVien("0001", "LE PHAM HOAI BAO", ngaysinh1, 9.0, lophoc1);
        SinhVien sv2 = new SinhVien("0002", "NGUYEN VU THU UYEN", ngaysinh2, 8.5, lophoc2);
        SinhVien sv3 = new SinhVien("0003", "PHAM HUY HOANG", ngaysinh3, 8.0, lophoc3);
 
        System.out.println("lay ten khoa cua sinh vien");
        System.out.println("khoa cua sinh vein 1: "+sv1.khoaSinhVienHoc());
        System.out.println("khoa cua sinh vein 2: "+sv2.khoaSinhVienHoc());
        System.out.println("khoa cua sinh vein 3: "+sv3.khoaSinhVienHoc());
        
        System.out.println("kiem tra thi dat cua sv1 " +sv1.kiemTraThiDat());
        
        System.out.println("kiem tra cung ngay sinh cua sv1 va sv3 "+sv1.kiemTraCungNgaySinh(sv3));
        System.out.println("kiem tra cung ngay sinh cua sv1 va sv2 "+sv1.kiemTraCungNgaySinh(sv2));
    }
}
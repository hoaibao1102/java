/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author MSI PC
 */
public class bai31/*hóa đơn cafe*/ {
    private String tenLoaiCaPhe;
    private double giaTien1Kg;
    private double khoiLuong;

    public bai31(String ten, double gia, double klg) {
        this.tenLoaiCaPhe = ten;
        this.giaTien1Kg = gia;
        this.khoiLuong = klg;
    }
    
    public String printTen(){
       return this.tenLoaiCaPhe;
    }
    
    public  double printGia(){  // khi kiểu dữ liệu trong public khác void thì phải có  kdl trả về (return)
       return this.giaTien1Kg;  
    }
    public double printKlg(){
        return this.khoiLuong;
    }
    
    public double tinhTongTien(){
        return this.giaTien1Kg * this.khoiLuong; // this là lấy thông tin nội bộ của lớp tên
    }
    //bổ sung phương thức
    // tên của những phương thức nên dùng động từ để làm Name
    public boolean kiemTraKhoiLuongLonHon(double kl){
        return this.khoiLuong > kl;
    }
    
    public boolean kiemTraTongTienLonHon500k(){
        return this.tinhTongTien() > 500000;
    }
    
    public double giamGia(double x){
        if(this.tinhTongTien()> 500000) {
            return (x/100)*this.tinhTongTien();
        }
        else return 0;
    }
    
    public double giaSauGiam(double x){
        return this.tinhTongTien() - this.giamGia(x);
    }
    
}

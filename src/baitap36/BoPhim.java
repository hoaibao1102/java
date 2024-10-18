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
public class BoPhim {
    private String tenPhim;
    private int namSanXuat;
    private hangSanXuat hangSanXuat;
    private double giaVe;
    private Ngay ngayChieu;

    public BoPhim() {
    }

    public BoPhim(String tenPhim, int namSanXuat, hangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public hangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(hangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public Ngay getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Ngay ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
    
    public boolean kiemTraGiaVeReHon(BoPhim phimKhac){
        return this.giaVe < phimKhac.giaVe; 
    }
    
    public String layTenHangSanXuat(){
       return this.hangSanXuat.getTenHang();
    }
    
    public double giaSauKhuyenMai(double x){
        return this.giaVe *(1-x/100);
    }
    
}

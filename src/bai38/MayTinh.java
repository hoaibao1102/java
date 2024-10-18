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
public class MayTinh {
    private Ngay ngaySanXuat;
    private HangSanXuat hangSanXuat;
    private double giaBan;
    private int thoiGianBaoHanh;

    public MayTinh() {
    }

    public MayTinh(Ngay ngaySanXuat, HangSanXuat hangSanXuat, double giaBan, int thoiGianBaoHanh) {
        this.ngaySanXuat = ngaySanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public Ngay getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Ngay ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    
    public boolean soSanhGiaBan(MayTinh mayKhac){
        return this.giaBan < mayKhac.giaBan;
    }
    
    public String layTenQuocGia(){
        return this.hangSanXuat.layTenQuocGia();   
    }
        
}

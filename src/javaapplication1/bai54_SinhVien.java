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
public class bai54_SinhVien implements Comparable<bai54_SinhVien>{
    private int maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private double diemTrungBinh;

    public bai54_SinhVien() {
    }

    public bai54_SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
    
    public String getTen(){
        String s = this.hoVaTen.trim();
        if(s.indexOf(" ")>=0){
            int vt = s.lastIndexOf(" ");
            return s.substring(vt+1);
        }else {
            return s;
        }
    }
    
    @Override
    public int compareTo(bai54_SinhVien o) {
        //phuong thức này sẽ trả về cho ta 3 tình huống <0 , =0, >0;
        // dựa trên so sánh tên
        String tenThis = this.getTen();
        String tenO = o.getTen();
        return tenThis.compareTo(tenO);

        // dựa trên điểm trung bình    
//        return (int) (this.diemTrungBinh - o.diemTrungBinh);
       
    }

    
    
    
}

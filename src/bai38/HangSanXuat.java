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
public class HangSanXuat {
    private String tenHang;
    private QuocGia quocGia;

    public HangSanXuat() {
    }

    public HangSanXuat(String tenHang, QuocGia quocGia) {
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }

    String layTenQuocGia() {
        return this.quocGia.getTen(); //To change body of generated methods, choose Tools | Templates.
    }
    
}

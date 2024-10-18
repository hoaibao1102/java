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
public class hangSanXuat {
    private String tenHang;
    private String quocGia;

    public hangSanXuat() {
    }

    public hangSanXuat(String tenHang, String quocGia) {
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
    
    
}

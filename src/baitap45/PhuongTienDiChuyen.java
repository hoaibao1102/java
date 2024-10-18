/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap45;

/**
 *
 * @author MSI PC
 */
public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen() {
    }

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }
    
    public String layTenHangSanXuat(){
        return this.hangSanXuat.getTenHangSanXuat();
    }
    
    public void batDau(){
        System.out.println("bat dau ....");
    }
    
    public void tangToc(){
        System.out.println("tang toc....");
    }
    public void dungLai(){
        System.out.println("dung lai....");
    }
    
    public abstract double layVanToc();
}

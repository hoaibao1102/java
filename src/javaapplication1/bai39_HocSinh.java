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
public class bai39_HocSinh extends bai39_ConNguoi {
    private String tenTruong , tenLop;

    public bai39_HocSinh() {
    }

    public bai39_HocSinh(String tenTruong, String tenLop, String hoTen, int tuoi) {
        super(hoTen, tuoi);
        this.tenTruong = tenTruong;
        this.tenLop = tenLop;
    }
    
    public void hocBai(){
        System.out.println(".. ... .. ...");
    }
}

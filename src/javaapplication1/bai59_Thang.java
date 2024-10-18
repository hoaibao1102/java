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
public enum bai59_Thang {
    thang1(31), 
    thang2(29), 
    thang3(31), 
    thang4(30), 
    thang5(31), 
    thang6(30), 
    thang7(31), 
    thang8(31), 
    thang9(30), 
    thang10(31), 
    thang11(30),
    thang12(31);
    
    private final int soNgay;

    bai59_Thang(int soNgay) {
        this.soNgay = soNgay;
    }
    
    public int soNgay(){
        return soNgay;
    }
}

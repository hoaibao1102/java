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
public abstract class bai44_Hinh {
    protected bai44_ToaDo toaDo;

    public bai44_Hinh() {
    }

    public bai44_Hinh(bai44_ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    public bai44_ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(bai44_ToaDo toaDo) {
        this.toaDo = toaDo;
    }
    
    
    public abstract double tinhDienTich();// không hiện thực cụ thể trong lớp abstract
       
   
    
}

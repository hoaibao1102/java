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
public class bai44_HinhTron extends bai44_Hinh {
    private double r;

    public bai44_HinhTron() {
    }

    public bai44_HinhTron(bai44_ToaDo toaDo,double r) {
        super(toaDo);
        this.r = r;
    }

   
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * this.r *this.r;
    }
    
    
}

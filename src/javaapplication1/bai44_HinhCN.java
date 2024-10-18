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
public class bai44_HinhCN extends bai44_Hinh{
    private int cd,cr;

    public bai44_HinhCN() {
    }

    public bai44_HinhCN(bai44_ToaDo toaDo,int cd, int cr) {
        super(toaDo);
        this.cd = cd;
        this.cr = cr;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    @Override
    public double tinhDienTich() {
        return this.cd * this.cr;
    }

   
    
}

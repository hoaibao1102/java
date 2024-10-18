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
public class bai41_ConNguoi {
    protected String hoVaTen;
    protected  int namSinh;

    public bai41_ConNguoi() {
    }

    public bai41_ConNguoi(String hoVaTen, int namSinh) {
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    public void an(){
        System.out.println("an");
    }
    
    public void ngu(){
        System.out.println("ngu");
    }
}

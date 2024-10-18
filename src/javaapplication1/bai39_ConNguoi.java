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
public class bai39_ConNguoi {
    private String hoTen;
    private int tuoi;

    public bai39_ConNguoi() {
    }

    public bai39_ConNguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public void an(){
        System.out.println("mam mam");
    }
    
    public void uong(){
        System.out.println("uc uc");
    }
    
    public void ngu(){
        System.out.println("kho kho");
    }
}

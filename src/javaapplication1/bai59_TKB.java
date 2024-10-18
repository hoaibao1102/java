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
public class bai59_TKB {
    private bai59_day thu;
    private String monHoc;

    public bai59_TKB() {
    }

    public bai59_TKB(bai59_day thu, String monHoc) {
        this.thu = thu;
        this.monHoc = monHoc;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    @Override
    public String toString() {
        return "bai59_TKB{"  + thu + ", học môn " + monHoc + '}';
    }
     
    
    
}

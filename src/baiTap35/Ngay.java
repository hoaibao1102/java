/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap35;

/**
 *
 * @author MSI PC
 */
public class Ngay {
    private int ngay;
    private int thang;
    private int nam;

    public Ngay() {
    }

    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        if(this.ngay >=1 && this.ngay<= 31){
            this.ngay = ngay;
        }
        else {
            this.ngay = 1;
        }
        
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
       if(this.thang<=12 && this.thang>=1){
           this.thang = thang;
       }else {
           this.thang = 1;
       }
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
       if(this.nam >=1 ){
           this.nam = nam;
       }else this.nam = 1;
    }
    
    
}

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
public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public MayBay() {
    }

    public MayBay(HangSanXuat hangSanXuat,String loaiNhienLieu) {
        super("maybay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }


    @Override
    public double layVanToc() {
        return 500;
    }
    
    public void catCanh(){
        System.out.println("cat canh.....");
    }
    
    public void haCanh(){
        System.out.println("ha canh.....");
    }
    
}

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
public class XeOto extends PhuongTienDiChuyen  {
    private String loaiNhienLieu;

    public XeOto() {
    }
    
    public XeOto( HangSanXuat hangSanXuat,String loaiNhienLieu) {
        super("o to", hangSanXuat);
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
        return 120;
    }
    
}

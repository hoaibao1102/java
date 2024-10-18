/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai38;

/**
 *
 * @author MSI PC
 */
public class QuocGia {
    private String maQuocGia, Ten;

    public QuocGia() {
    }

    public QuocGia(String maQuocGia, String Ten) {
        this.maQuocGia = maQuocGia;
        this.Ten = Ten;
    }

    public String getMaQuocGia() {
        return maQuocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }
    
}

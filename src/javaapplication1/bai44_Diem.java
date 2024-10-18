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
public class bai44_Diem extends bai44_Hinh{

    public bai44_Diem() {
    }

    public bai44_Diem(bai44_ToaDo toaDo) {
        super(toaDo);
    }
    
    @Override
    public double tinhDienTich(){
        return 1;
    }
    
    
}

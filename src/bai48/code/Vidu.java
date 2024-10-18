/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai48.code;

/**
 *
 * @author MSI PC
 */
public class Vidu {
    private infor infor;
    
    public void method(){
//        this.infor.a;// sẽ bị báo lỗi vì a không thể truy xuất được
        this.infor.b = 2; // có thể truy cập được 
    }
}

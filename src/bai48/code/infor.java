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
public class infor {
    private int a;
    int b;
    protected int c;
    public int d;
    
    public void method(){
        this.a= 1; // có thể dùng private bên trong class này
        this.b = 2; // chỉ truy cập được khi các class chung package 
    }
         
}

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
public class bai43_MyMath {
    public int timMin (int a,int b){
        if (a> b) return b;
        else return a;
    }
    
    public double timMin(double a, double b){
         if (a > b) return b;
        else return a;
    }
    
    public double tinhTong(double a, double b){
        return a+b;
    }
    
    public double tinhTong(double []arr){
        double tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];
        }
        return tong;
    }
}

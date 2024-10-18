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
public class bai32 {
    private int day;
    private int month;
    private int Year;

    public bai32() {
    }

    public bai32(int day, int month, int Year) // thông số mà người dùng nhập vào
    {
        if(day>=1 && day <= 31){
            this.day = day;
        }else {
            this.day=1;
        }
        if(month>=1 && month <= 12){
            this.month = month;
        }else {
            this.month=1;
        }
        if(Year>=0 ){
            this.Year = Year;
        }else {
            this.Year=1;
        }
        this.day = day;// kiểm tra day có vượt qua 31 ngày hay không
        this.month = month;
        this.Year = Year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>=1 && day <= 31){
            this.day = day;
        }else {
            this.day=1;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
         if(Year >= 0 ){
            this.Year = Year;
        }else {
            this.Year = 1;
        }
      
    }
    
    
    
}

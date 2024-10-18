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
public class bai33 {
    private int day;
    private int month;
    private int Year;

    public bai33() {
    }

    public bai33(int day, int month, int Year) {
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
        if(month>=1 && month <= 12){
            this.month = month;
        }else {
            this.month=1;   
        }
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
         if(Year>=0 ){
            this.Year = Year;
        }else {
            this.Year=1;
        }
    }

    @Override
    public String toString() {
        return this.day +"/"+ this.month+"/"+this.Year;
    }
    
    
    

    
}

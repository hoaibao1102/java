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
public class bai30 {
    private int day;
    private int month;
    private int year;

    public bai30(int day, int month , int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void printDay(){
        System.out.println("Day: "+this.day);
    }
    
    public void printMonth(){
        System.out.println("Month: "+this.month);
    }
    
    public void printYear(){
        System.out.println("Year: "+this.year);
    }
    
    public void printDate(){
        System.out.println("Day: "+this.day +" Month: "+this.month +" Year: " +this.year);
    }
}

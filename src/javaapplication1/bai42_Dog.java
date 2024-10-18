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
public class bai42_Dog extends bai42_Animal{

    public bai42_Dog() {
    }

    public bai42_Dog(String name) {
        super("Dog");
    }

    @Override 
    public void makeSound() {
        System.out.println("ăn xương");// phương thức mới cho lớp con ghi đè lên phương thức cha
    }

    @Override
    public void eat() {
        System.out.println("gâu gâu");
    }
    
}

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
public class bai42_Bird extends bai42_Animal{

    public bai42_Bird() {
    }

    public bai42_Bird(String name) {
        super("Bird");
    }

    @Override
    public void makeSound() {
        System.out.println("chíp chíp");
    }

    @Override
    public void eat() {
        System.out.println("ăn thóc");
    }
    
}

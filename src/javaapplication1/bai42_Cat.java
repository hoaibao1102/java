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
public class bai42_Cat extends bai42_Animal {

    public bai42_Cat() {
    }

    public bai42_Cat(String name) {
        super("cat");
    }

    @Override
    public void makeSound() {
        System.out.println("ăn cá");
    }

    @Override
    public void eat() {
        System.out.println("meo meo");
    }
    
}

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
public class bai42_Animal {
    protected String name;

    public bai42_Animal() {
    }

    public bai42_Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void eat(){
        System.out.println("ăn");
    }
    
    public void makeSound (){
        System.out.println("âm thanh");
    }
    
    public void sleep(){
        System.out.println(" zzzzzz zzzz ");
    }
}

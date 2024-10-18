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
public class bai40_dog extends bai40_Animal{

    public bai40_dog() {
    }

    public bai40_dog(String name) {
        super("dog"); // truyền dữ liệu vào lớp cha (lớp con tên dog)
    }
    
    public void bark(){
        System.out.println("gau gau");
    }
}

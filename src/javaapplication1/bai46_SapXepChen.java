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
public class bai46_SapXepChen implements bai46_SapXepInterface {

    @Override
    public void sapXepTang(double[] arr) {
        int i, j;
        int n = arr.length;
        double key;
        for (i = 0; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }

    @Override
    public void sapXepGiam(double[] arr) {
        int i, j;
        int n = arr.length;
        double key;
        for (i = 0; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}

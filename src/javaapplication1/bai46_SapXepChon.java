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
public class bai46_SapXepChon implements bai46_SapXepInterface {

    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length;
        int i, j, min_indx;
        for (i = 0; i < n; i++) {
            min_indx = i;
            for (j = i+1; j < n; j++) {
                if (arr[j] < arr[min_indx]) {
                    min_indx = j;
                    double temp = arr[min_indx];
                    arr[min_indx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    @Override
    public void sapXepGiam(double[] arr) {
        int n = arr.length;
        int i, j, min_indx;
        for (i = 0; i < n; i++) {
            min_indx = i;
            for (j = i+1; j < n; j++) {
                if (arr[j] > arr[min_indx])  {
                    min_indx = j;
                    double temp = arr[min_indx];
                    arr[min_indx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}

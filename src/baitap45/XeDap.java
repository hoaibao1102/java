/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap45;

/**
 *
 * @author MSI PC
 */
public class XeDap extends PhuongTienDiChuyen{

    public XeDap() {
    }

    public XeDap(HangSanXuat hangSanXuat) {
        super("xe dap", hangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 40;
    }

   
}

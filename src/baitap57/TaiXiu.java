/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap57;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MSI PC
 */
public class TaiXiu {

    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 500000;
        Scanner sc = new Scanner(System.in);
        Locale lc = new Locale("vi", "VN");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        int luaChon = 1;

        do {
            System.out.println("------------MỜI BẠN LỰA CHỌN--------------");
            System.out.println("chọn (1) để tiếp tục chơi.");
            System.out.println("chọn phím bất kì để thoát.");
            luaChon = sc.nextInt();

            if (taiKhoanNguoiChoi == 0) {
                System.out.println("BẠN ĐÃ HẾT TIỀN");
                break ;
            }

            // CHỌN CHƠI HAY KHÔNG
            if (luaChon == 1) {
                System.out.println("***BẮT ĐẦU CHƠI:");
                System.out.println("**** Số tiền hiện có của bạn: " + numf.format(taiKhoanNguoiChoi) + ", bạn muốn cược bao nhiêu? ");
                double datCuoc = 0;

                // ĐẶT CƯỢC
                do {
                    System.out.print("*****Đặt cược (0 < số tiền cược <= " + numf.format(taiKhoanNguoiChoi) + ":");
                    datCuoc = sc.nextDouble();
                } while (datCuoc > taiKhoanNguoiChoi || datCuoc <= 0);
                int luaChonMat = 0;

                // CHỌN MẶT
                do {
                    System.out.println("**** CHỌN: 1 LÀ TÀI , 2 LÀ XỈU ");
                    luaChonMat = sc.nextInt();
                } while (luaChonMat != 1 && luaChonMat != 2);

                // TUNG XÚC XẮC
                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();

                int giaTri1 = xucXac1.nextInt(5) + 1;
                int giaTri2 = xucXac2.nextInt(5) + 1;
                int giaTri3 = xucXac3.nextInt(5) + 1;

                int ketQua = giaTri1 + giaTri2 + giaTri3;
                System.out.println("****Kết quả" + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
                if (ketQua == 3 || ketQua == 18) {
                    System.out.println("****" + ketQua + "****");
                    System.out.println("Nhà cái xin");
                } else if (ketQua >= 4 && ketQua <= 10) {
                    System.out.println("**** " + ketQua + " ****");
                    if (luaChonMat == 2) {
                        System.out.println("*** RA XỈU ***");
                        System.out.println("");
                        System.out.println("Bạn đã thắng");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("**** Số tiền hiện có của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("*** RA TÀI ***");
                        System.out.println("");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Nhà cái xin");
                        System.out.println("**** Số tiền hiện có của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    }
                } else {
                    if (luaChonMat == 1) {
                        System.out.println("*** RA TÀI ***");
                        System.out.println("");
                        System.out.println("Bạn đã thắng");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("**** Số tiền hiện có của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("*** RA XỈU ***");
                        System.out.println("");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Nhà cái xin");
                        System.out.println("**** Số tiền hiện có của bạn là: " + numf.format(taiKhoanNguoiChoi));

                    }
                    System.out.println("**** Số tiền hiện có của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    
                }
                if (taiKhoanNguoiChoi == 0) {
                    System.out.println("BẠN ĐÃ HẾT TIỀN");
                    System.out.println("--- TẠM BIỆT ---");
                    break;

                }
            }
        } while (luaChon == 1);

    }

}

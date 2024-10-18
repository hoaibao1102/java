/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Date;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author MSI PC
 */
public class tuHoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Hello World!");
//        
//        System.out.println("hoaibao");

////          ÉP KIỂU 
//    // ép kiểu giữa biến nguyên thủy và đối tượng
//    int x = new Interger(23);
//    System.out.println(x);


////           HÀM SCANNER
//Scanner sc = new Scanner(System.in);
//        System.out.println("nhap so a");
//        int a = sc.nextInt() ;
//        System.out.println(a);


////          CÁC PHÉP TOÁN SO SÁNH VÀ ĐIỀU KIỆN TRONG JAVA
//Scanner sc = new Scanner(System.in);
//        System.out.print("nhap so a ");
//        int a = sc.nextInt();
//        System.out.print("nhap so b ");
//        int b = sc.nextInt();
//        // xuất kết quả so sánh 
//        System.out.println(a+"="+b+ " : " +(a==b));
//        System.out.println(a+"!="+b+ " : " +(a!=b));
//        System.out.println(a+"<"+b+ " : " +(a<b));
//        System.out.println(a+"<="+b+ " : " +(a<=b));
//        System.out.println(a+">"+b+ " : " +(a>b));
//        System.out.println(a+">="+b+ " : " +(a>=b));

////          TOÁN TỬ ĐIỀU KIỆN 
//Scanner sc = new Scanner(System.in);
//        System.out.println("nhap so a ");
//        int a = sc.nextInt();     
//        String ketqua = (a%2==0)?"so chan":"so le";// toán tử điều kiện giúp lập trình  nhanh 1 kết quả trên dòng và có thể tái sử dụng 
//        System.out.println(a + " la " + ketqua);


////             LỚP MATH VÀ CÁC HÀM TOÁN HỌC 
//double a,b;
//Scanner sc = new Scanner(System.in);
//        System.out.println("nhap a ");
//        a = sc.nextDouble();
//        System.out.println("nhap b ");
//        b = sc.nextDouble();
//        
//        //Ham tri tuyet doi
//        System.out.println("|a|="+ Math.abs(a));
//        // hàm tìm min 
//        System.out.println("min(a,b) =" + Math.min(a, b));
//        //hàm tìm max
//        System.out.println("max(a,b)= " + Math.max(a, b));
//        //hàm ceil
//        System.out.println("ceil(a)= " + Math.ceil(a));
//        //Hàm floor 
//        System.out.println("floor(b) =" + Math.floor( b));
//        //hàm can bac hai sqrt 
//        System.out.println("sqrt(a)= " + Math.sqrt(a));
//        //hàm mũ a mũ b
//        System.out.println("a^b ="+ Math.pow(a, b));
//        
////          ÔN TẬP VÒNG LẶP FOR IN BẢNG CỬU CHƯƠNG
//System.out.println("BANG CUU CHUONG ");
//        for (int i = 2; i < 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i+ "x" +j+ "=" +(i*j));
//            }
//            System.out.println("----");
//        }
////             ÔN TẬP VÒNG LẶP WHILE CHUYỂN ĐỔI SỐ THẬP PHÂN THÀNH NHỊ PHÂN 
//int a;
//Scanner sc = new Scanner(System.in);
//        System.out.println("nhap vao so a >0  ");
//        a = sc.nextInt();
//        System.out.println("he nhi phan cua so a la ");
//        String nhiPhan = "";
//        int n;
//        while(a>0){
//           nhiPhan =  (a%2) + nhiPhan;
//           a=a/2; 
//        }
//        System.out.println(nhiPhan);


//              CÁCH SỬ DỤNG CÂU LỆNH BREAK CONTINUE RETURN 
// break và continue có thể sử dụng với label(là tên của một khu vực code cú pháp label:tên)
// với trường hợp không có label 
//    int out, in =0 ;
//        for (out = 0; out < 10; out++) {
//            for (in = 0; in < 20; in++) {
//                if (in>10) {
//                    break;//không có label thì break chỉ thực hiện được câu lệnh gần nhất với nó
//                }
//                System.out.println("ben trong vong lap out: out = " +out +"in ="+in);
//            }
//            System.out.println(" ben ngoai vong lap out: out= "+out+" in "+in);
//        }
//với trường hợp có sử dụng label
//        int out, in = 0;
//        outer:
//        for (out = 0; out < 10; out++) {
//            for (in = 0; in < 20; in++) {
//                if (in > 10) {
//                    break outer;// khi break có label thì nó sẽ kết thúc luôn cả vòng lặp lớn chưa nó
//                }
//            }
//            System.out.println("ben trong vong lap out: out = " + out + "in =" + in);
//        }
//        System.out.println(" ben ngoai vong lap out: out= " + out + " in " + in);
// với câu lệnh continue cũng tương tự có 2 loại nhưng nó sẽ bỏ qua câu lệnh phía bên dưới nó


////bài 27 CÂU LỆNH TRY   CATCH    FINALLY ĐỂ BẮT GIŨ CÁC NGOẠI LỆ
////=>giúp chương trình không bị ngắt ngang khi gặp lỗi
//        Scanner sc = new Scanner(System.in);
//        int n = 0;// n phải có giá trị nếu không try catch nó sẽ bị lỗi
//        try {
//            System.out.println("Nhap vao so nguyen n");
//            n = sc.nextInt();// trường hợp có lỗi xảy ra
//        } catch (Exception e) {
//            System.out.println("nhap du lieu khong dung");// trong catch thì mình bỏ lỗi có thể xảy ra
//            //nếu không có try catch thì khi nhập dữ liệu sai thì chương trình sẽ ngưng luôn 
//            //không thực hiện những câu lệnh còn lại
//        } finally {
//            System.out.println("finally");
//            // nếu đoạn code của ta có lỗi hay không có lỗi thì
//            //câu lệnh bên trong finally vẫn được thực thi(có thể có hoặc không)
//        }
//        System.out.println("gia tri nhap la " + n);
//        System.out.println("ket thuc chuong trinh");

////bài 27a CƠ BẢN VỀ MẢNG TRONG JAVA
//        double[] mang1; // cách khai báo mảng
//        double mang2[]; //có thể dùng 2 cách (linh hoạt)
//
//        mang2 = new double[]{1, 2, 3, 4, 5};// cách khai báo trực tiếp khi biết số lượng và giá trị trong mảng
//        for (int i = 0; i < mang2.length; i++) {
//            System.out.println(" gia tri thu " + i + " của mang 2 la: " + mang2[i]);
//        }
//
//        mang1 = new double[10];// trong ngoặc là số lượng phần tử
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < mang1.length; i++) {
//            System.out.print("nhap phan tu thu " + i + " : ");
//            mang1[i] = sc.nextDouble(); // gắn giá trị cho mang
//            System.out.println();
//        }
//        double tong = 0;
//        for (int i = 0; i < mang1.length; i++) {
//            tong += mang1[i];// lấy giá trị của mang
//        }
//        System.out.println("tong cua mang la: " + tong);

//bài 28 LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG LÀ GÌ
/*
MỤC TIÊU :đảm bảo tính đúng đắn của dữ liệu
lớp(class) là khuôn mẫu để sinh ra đối tượng
*/

//// bài 30 XÂY DỰNG LỚP(CLASS ) TRONG JAVA
///*Các từ khóa xây dựng class
//public 
//abstract học trong kế thừa
//final tạo ra những hằng số (hay là constant trong static)
//class ClassName : là từ khóa bắt buộc
//extends Superclass
//         */
// /*có 2 kiểu DL
//Primitive KDL nguyên thủy
//Reference 
//         */
////phương thức constructor để nhận giá trị (đối tượng với giá trị bên trong )
////=> phải tạo ra đầu tiên
//// hàm này không có kdl trả về
////tạo ra constructor rỗng để làm gì?
//        bai30 md = new bai30(25, 2, 2029);
//        md.printDate();
//        md.printDay();
//        md.printMonth();
//        md.printYear();
//// khi ta có đối tượng md dựa trên kdl bai30 ta tạo ra thì ta có thể gọi được những phương thức đã tạo bên trong bai30


////bài 31 HIỂU RÕ VỀ PHƯƠNG THỨC TRONG LẬP TRÌNH JAVA
//bai31 hd = new bai31("Trung Nguyen", 100000, 5.5);
//        System.out.println("loai ca phe ban mua la " + hd.printTen() + " voi gia 1 kg la " + hd.printGia());
//        System.out.println("so tien ban can tra cho " + hd.printKlg() + " la " + hd.tinhTongTien());
//        bai31 hd2 = new bai31("Nestcafe", 150, 15);
//        System.out.println("loai ca phe ban mua la " + hd2.printTen() + " voi gia 1 kg la " + hd2.printGia());
//        System.out.println("so tien ban can tra cho " + hd2.printKlg() + " la " + hd2.tinhTongTien());
//
//        // thêm phương thức
//        System.out.println("Kiem tra khoi luong > 2kg:  " + hd.kiemTraKhoiLuongLonHon(2));
//        System.out.println("Kiem tra khoi luong >1 kg: " + hd.kiemTraKhoiLuongLonHon(1));
//        System.out.println("Kiem tra tong tien > 500k: " + hd.kiemTraTongTienLonHon500k());
//        System.out.println("Giam gia 10% cho don hang hon 500k: " + hd.giamGia(10));
//        System.out.println("Giam gia 10% cho don hang hon 500k: "+hd2.giamGia(10));
//        System.out.println("khach phai tra la "+hd.giaSauGiam(10));


//// BÀI 32 PHƯƠNG THỨC GET VÀ SET 
///*
//Để có thể thay đổi dữ liệu của hàm cần sử dụng hàm SET 
//và Nếu muốn lấy dữ liệu ra thì cần sử dụng hàm GET
//*/
//        bai32 myDate = new bai32(31, 1, 2021);
//        System.out.println("day: " + myDate.getDay());// để lấy dữ liệu ra
////hàm get sẽ trả về kiểu dữ liệu đúng cái biến của chúng ta
//// bên ngoài có thể lấy dữ liệu thông qua hàm get
//// tương tự nếu đã gắn mà muốn thay đổi dữ liệu thì ta dùng hàm set để set ngược vào,
//// sau khi đã có hàm set ta có thể thay đổi dữ liệu như sau
//        myDate.setDay(13);
//        System.out.println("day: "+myDate.getDay());
//// khi dùng insert code thì nhớ chú ý khi gọi getter và setter (chú ý điều kiện set và get )
//        System.out.println("year: " + myDate.getYear());
//        myDate.setYear(-1);
//        System.out.println("year: " + myDate.getYear());


////BÀI 33 PHƯƠNG THỨC TOSTRING 
//        bai33 md1 = new bai33(15,5,2032);
//        bai33 md2 = new bai33(17,1,22);
//        bai33 md3 = new bai33(15,7,205);
//        
//        System.out.println(md1);// sẽ in ra kiểu dữ liệu mà ta không thể hiểu thì phương thức tostring sẽ giúp ta làm kiểu dl in ra dễ hiểu hơn 
//        //HÀM TOSTRING SẼ GIÚP TA TRẢ RA 1 CHUỖI 
//        // sau khi tạo xong hàm toString thì ta có thể trả về được một chuỗi dữ liệu
//        System.out.println(md1.toString());// khi đã có hàm toString thì chỉ cần gọi tên của hàm chứ không cần .hàm toString để gọi hết nó ra nữa
//        System.out.println(md2);
//        System.out.println(md3);
//        // có thể dùng insert code để tạo hàm toString


////BÀI 34 34 . Hiểu rõ phương thức so sánh equals và hascode 
//        bai34 md1 = new bai34(15, 5, 2032);
//        bai34 md2 = new bai34(17, 1, 22);
//        bai34 md3 = new bai34(15, 5, 2032);
//        
//        System.out.println(md1);
//        System.out.println(md2);
//        System.out.println(md3);
//        
//        if(md1 == md3){
//            System.out.println("md1== md3");
//        }else {
//            System.out.println("md1 != md3");
//        }
//        // mặc dù md1 giống md3 nhưng để dấu == thì máy không hiểu cho kiểu dl chuỗi 
//        // thì trong java phải sử dụng phương thức equals
//        // và phải tạo hàm trước khi sử dụng nó
//        //sau khi tạo được hàm 
//        if(md1.equals(md3)){
//            System.out.println("md1 == md3");
//        }else {
//            System.out.println("md1 != md3");
//        }
//        
//        //hàm equals chỉ giải quyết được vấn đề bằng hoặc khác của chuỗi!!!
//        //về hàm băm(hascode) tự tìm hiểu thêm
//        // là một hàm giúp cho chúng ta trả về một giá trị nào đó 
//        // và giá trị đó đại diện cho đối tượng đó
//        System.out.println("hashcode md1: " +md1.hashCode()); // ta có 2175043 là đại diện cho md1


// BÀI 35,36,37,38 BÀI TẬP (LÀM BÊN PACKAGES BÀI TẬP NHÉ)


//// BÀI 39 TÍNH KẾ THỪA TRONG LẬP TRÌNH 
////tạo một lớp mới dựa trên lớp hiện có thì lớp mới sẽ kế thừa lớp hiện có
//// có 3 mô hình kế thừa :
//*/
//        bai39_HocSinh hs1 = new bai39_HocSinh("TQT", "A", "LEPHAMHOAIBAO", 20);
//        hs1.ngu();
//        System.out.println("ten" + hs1.getHoTen());
//        hs1.hocBai();
//// lớp con sẽ kế thừa toàn bộ thuộc tính của lớp cha 
//// và sẽ có thêm thuộc tính của riêng nó


////BÀI 40 CÁC DẠNG KẾ THỪA
//// lớp cha sẽ có protected và những lớp con có thể sd những biến protected đó
//// KẾ THỪA ĐƠN
//System.out.println("dog");
//bai40_dog dog = new bai40_dog();
//dog.an();// kế thừa lớp an của animal(lớp cha)
//dog.bark();// lớp của rieng dog(lớp con)
//System.out.println("");
//
//// ĐA KẾ THỪA
//System.out.println("baby dog");
//bai40_babyDog bbdog = new bai40_babyDog();
//bbdog.an();
//bbdog.bark();
//bbdog.sweep();
//bbdog.name = "abc"; 
//        System.out.println("name bbDog: "+bbdog.name);
//// babyDog là đời thứ 3 
//System.out.println("");
//
////KẾ THỪA THEO THỨ BẬC
///*
//ta đã có bậc thứ 1 là Animal 
//thì bậc thứ 2 là các loại động vật khác nhau*/
//        System.out.println("ga");
//        bai40_chicken ga = new bai40_chicken() ;
//        ga.an();
//        ga.chip();
//        System.out.println("");
//        System.out.println("meo");
//        bai40_cat meo = new bai40_cat();
//        meo.meow();
//        meo.an();



//// BÀI 41 VÌ SAO KHÔNG CÓ ĐA KẾ THỪA TRONG JAVA
//bai41_NguoiBL nbl = new bai41_NguoiBL("Bgv A", 1990);
//
//bai41_NguoiMy nm = new bai41_NguoiMy("John", 2001);
//
//bai41_NguoiVN nvn = new bai41_NguoiVN("Nguyen Van A", 2003);
//
//nbl.xinChao();
//
//nvn.xinChao();
//
//nm.xinChao();
//
//// class HocSinh không thể kế thừa 3 class người kia 
//// một class cha có thể có nhiều class con nhưng không thể ngược lại



//// BÀI 42 GHI ĐÈ PHƯƠNG THỨC -OVERRIDING
//// Sử dụng để viết lại phương thức đã có trong lớp cha
///*
//lý do vì sao nên sử dụng ghi đè phương thức
//+Vì phương thức chung trong lớp cha không phải lúc nào cũng phù hợp cho tất cả
//các lớp con
//3 quy tắc khi dùng ghi đè phương thức overriding
//+lớp con và lớp cha phải có kế thừa
//+ lớp con và  lớp cha phương thức phải giống nhau (vd phuong thức eat)
//+ phương thức trong lớp con phải có tham số giống với lớp cha 
//*/
//        System.out.println("test dog");
//        bai42_Dog d= new bai42_Dog();
//        d.eat();
//        d.makeSound();
//        d.sleep();
//        
//        System.out.println("");
//        System.out.println("test Cat");
//        bai42_Cat c = new bai42_Cat();
//        c.eat();
//        c.makeSound();
//        c.sleep();
//        
//        System.out.println("");
//        System.out.println("test Bird ");
//        bai42_Bird b = new bai42_Bird();
//        b.eat();
//        b.makeSound();
//        b.sleep();



//// BÀI 43 NẠP CHỒNG PHƯƠNG THỨC- OVERLOADING
//    bai43_MyMath mm = new bai43_MyMath();
//        System.out.println("min cua 5 va 6 la "+mm.timMin(5, 6));
//        System.out.println("min cua 5,5 va 6,5 la "+mm.timMin(5.5, 6.5));
//        
//        System.out.println("tinh tong cua 4 va 4 la "+mm.tinhTong(4, 4));
//        double arr[] = new double []{6,4,5,15};
//        System.out.println("tinh tong cua mang arr: "+mm.tinhTong(arr));
//    
//     // mục tiêu của phương thức overloading là viết ra những phương thức giống nhau 
//     // nhưng nhận những tham số Khác Nhau và có thể xử lý khác nhau
//     // ĐÓ LÀ OVERLOADING
        


//// BÀI 44 LỚP VÀ PHƯƠNG THỨC TRỪU TƯỢNG ABSTRACT
//        bai44_ToaDo td1 = new bai44_ToaDo(5, 5);
//        bai44_ToaDo td2 = new bai44_ToaDo(7, 9);
//        bai44_ToaDo td3 = new bai44_ToaDo(12, 1);
//
////bai44_Hinh h = new bai44_Hinh(td1) ;   ngay lập tức sẽ nhận được báo lỗi
///*
//lớp abstract khi được tạo ra thì không thể gọi contructor bên trong lớp đó được
//có thể hiểu như không tồn tại
//         */
//        bai44_Hinh h1 = new bai44_Diem(td1);
//
//        bai44_Hinh h2 = new bai44_HinhTron(td2,10);
//
//        bai44_Hinh h3;
//        h3 = new bai44_HinhCN(td3,10, 5);
//
//        System.out.println("dien tich diem la " + h1.tinhDienTich());
//        System.out.println("dien tich hinh tron la " + h2.tinhDienTich());
//        System.out.println("dien tich hinh chu nhat la " + h3.tinhDienTich());
//        
//        /*Tóm tắt
//        +Một cái lớp mà bạn không muốn hiện thực nó cụ thể mà chỉ muốn nó là một khái niệm trừu tượng chung chung 
//        thì chúng ta sẽ thêm từ khóa abstract phía trước class và trong 1 lớp abstract thì chúng ta có thể tạo ra
//        những phương thức abstract(chỉ có tên phương thức mà không cụ thể đó chấm phẩy luôn thì những lớp con phải
//        hiện thức cụ thể phương thức đó bằng cách overriding lại)*/



// BÀI 45 LÀM BÀI TẬP TỔNG HỢP NHÉ



//// Bài 46 HIỂU RÕ VỀ INTERFACE TRONG LẬP TRÌNH JAVA
///*bài toán cuộc sống 
//ví dụ bạn muốn thừa hưởng tính cách của cả mẹ và bố (đa kế thừa) thì các bài trước 
//chưa giải quyết được vấn đề này 
//thì interface sẽ giải quyết được vấn đề này 
//Mục đích để thu được tính trừu tượng hoàn toàn và tính đa kế thừa
//+ Thì trong interface chỉ có những phương thức trừu tượng 
//và không có những biến số(chỉ có hằng số thôi)
//+ một lớp con có thể kế thừa nhiều lớp interface và 1 lớp interface có thể kế thừa 
//những lớp interface khác
//
//*/
//// Khi dùng interface thì khi muốn kế thừa thì không dùng extends nữa mà dùng implements        
//        System.out.println("test may tinh ");
//// ta không thể khai báo như lớp trừu tượng(abstract) được mà ta sẽ khai báo như sau
//// ta sẽ sử dụng thẳng luôn tên của class con
//        bai46_MayTinhCasioFX500 mt1 = new bai46_MayTinhCasioFX500();
//        bai46_MayTinhCasioCal500 mt2 = new bai46_MayTinhCasioCal500();
//        
//        System.out.println("mt1  5 + 3 = "+mt1.cong(5, 3));
//        System.out.println("mt2  4 * 5 =  "+mt2.nhan(4, 5));
//        System.out.println("mt2 4 / 5 = "+mt2.chia(4,5));
//        System.out.println("");
//        System.out.println("mt2 4 / 0 = "+mt2.chia(4,0));
//
//        System.out.println("test sap xep");
//        double []arr= new double[] {5,1,3,4,6,8,0};
//        double []arr2= new double[] {6,2,7,9,2,4,5};
//        
//        bai46_SapXepChen sxchen = new bai46_SapXepChen();
//        bai46_SapXepChon sxchon = new bai46_SapXepChon();
//        
//        System.out.println("sắp xếp tăng kieu chen: ");
//        sxchen.sapXepTang(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println("");
//        
//        System.out.println("sắp xếp giam kieu chon: ");
//        sxchon.sapXepGiam(arr2);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i]+" ");
//        }
//        System.out.println("");
//        
//        /* khi một class con muốn kế thừa 2 lớp interface thì chỉ cần 1 implements 
//        rồi tên của 2 lớp interface muốn kế thừa( 2 tên này cách nhau bằng dấu , )
//        ví dụ bên phan mem may tinh
//        */
//        System.out.println("");
//        System.out.println("test phan mem may tinh");
//        bai46_PhanMemMayTinh pmmt = new bai46_PhanMemMayTinh()  ;
//        System.out.println("ta co 3 + 5 = "+ pmmt.cong(3, 5));
//        double [] arr3 = new double []{5,6,3,45,7,1,35};
//        pmmt.sapXepTang(arr3);
//        System.out.println("sap xep tang mang 3");
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.print(arr3[i]+" ");
//        }
//        // sau khi PhamMemMayTinh kê thừa 2 lớp interface thì nó đã có cả 2 thuộc tính 
//        // đó là tính toán và sắp xếp của cả 2 lớp 
//        // VÀ NÓ ĐÃ GIẢI QUYẾT ĐƯỢC VẤN ĐỀ ĐA KẾ THỪA
//        // => ĐÓ LÀ INTERFACE



// BÀI 47 HIỂU RÕ VỀ GÓI - PACKAGE TRONG JAVA
/*
là tập hợp các lớp, các giao tiếp , các kiểu liệt kê và các chú thích
tại một khu vực không thể đặt 2 gói có tên giống nhau
có 2 loại : định nghĩa trước và định nghĩa bởi người dùng*/
//=> khi làm một dự án thực tế thì nên chia nhỏ dự án ra thành nhiều package để dễ làm việc



// BÀI 48 PHÂN BIỆT ĐIỀU KHIỂN PUBLIC , PROTECTED , PRIVATE 
//private chỉ có thể sử dụng biến bên trong class của bạn 
// nếu không sử dụng từ khóa thì có thể dùng biến đó bên trong class và package
// protected thì có thể sử dụng trong class , package và subclass
// public thì có thể được sử dụng ở bất kì nơi nào
// bài này sẽ được code bên trong bai48



////BÀI 49, 50, 51, 52 XỬ LÝ CHUỖI TRONG LẬP TRÌNH JAVA
////P1 LẤY ĐỘ DÀI CHUỖI VÀ KÍ TỰ TRONG CHUỖI JAVA
//        Scanner sc = new Scanner(System.in);
//        String s ;
//        System.out.println("nhap vao chuoi: ");
//        s = sc.nextLine();
//        System.out.println("--------");
//        
//        // hàm length  => lấy ra độ dài chuỗi
//        System.out.println("do dai cua chuoi tren la: "+s.length());
//        // ứng dụng thực tế độ dài của mật khẩu hoặc username 
//        
//        // hàm charAt(vị trí) => lấy ra kí tự tại 1 vị trí bất kì (nằm trong độ dài của chuỗi)
//        int doDai = s.length();
//        for (int i = 0; i < doDai; i++) {
//            System.out.println("vi tri "+ i + " la chu "+s.charAt(i));
//        }
//        // ứng dụng thực tế thì lấy số điện thoại ở vn kiểm tra số đầu có phải số 0 hay không
//        
//        // hàm getChars(vị trí bắt đầu , vị trí kết thúc, mảng lưu dữ liệu, vị trí bắt đầu lưu của mảng)
//        //=> lấy hàng loạt những kí tự
//        char[] arrayChar  = new char [100];
//        s.getChars(2, 5, arrayChar, 0);
//        for (int i = 0; i < arrayChar.length; i++) {
//            System.out.println("vi tri thu "+ i +" cua mang arrayChar la " + arrayChar[i]);
//        }
//        //có 1 hàm tương tự
//        //getByte() => có 3 cách lấy ra giá trị của các kí tự thành 1 mảng
//        byte[] arrayBytes = s.getBytes();
//        for (byte arrayByte : arrayBytes) {
//            System.out.println(arrayByte);
//        }
       
////P2 SO SÁNH CHUỖI TRONG JAVA
//// ứng dụng thực tế so sánh tên người dùng này với tên người khác 
//// hoặc là xác nhận mật khẩu khi đăng nhập
//        String s1 = " titv.vn";
//        String s2 = " TITV.vn";
//        String s3 = " titv.vn";
//        
////hàm equals()   => so sánh 2 chuỗi giống nhau(có phân biệt hao và thường)
//        System.out.println("s1 equals s2 "+ s1.equals(s2));
//        System.out.println("s1 equals s3 "+ s1.equals(s3));
//        
//// hàm equalsIgnoreCase =>ignore : bỏ qua , case : loại chữ(hoa thường)
////=> so sánh không phân biệt chữ hoa thường
//        System.out.println("s1 equalsIgnoreCase s2 "+ s1.equalsIgnoreCase(s2));
//        System.out.println("s1 equalsIgnoreCase s3 "+ s1.equalsIgnoreCase(s3));
//        
//// hàm compareTo() => so sánh > < =
////ứng dụng thực tế sắp xếp danh sách lớp theo alpha b
//        String sv1 = "Nguyễn Văn A";
//        String sv2 = "Nguyễn Văn B";
//        String sv3 = "Nguyễn Văn";
//        String sv4 = "Nguyễn Văn A";
//
//        System.out.println("sv1 compareTo sv2 " + sv1.compareTo(sv2));
//        System.out.println("sv1 compareTo sv3 " + sv1.compareTo(sv3));
//        System.out.println("sv1 compareTo sv4 " + sv1.compareTo(sv4));
//        System.out.println("-------");
//// hàm này sẽ trả về 3 giá trị (âm: nhỏ hơn , dương: lớn hơn , 0: bằng nhau)        
//        
//// hàm compareToIgnoreCase => tương tự hàm compareTo, không phân biệt chữ hoa chữ thương
//
//// hàm regionMatches(kí tự bắt đầu của chuỗi muốn so sánh, chuỗi muốn so sánh cùng,
////                   kí tự bắt đầu của chuỗi muốn so sánh cùng , số kí tự muốn so sánh) 
////=> so sánh 1 đoạn
//// ứng dụng thực tế so sánh chuỗi đầu của nhà mạng 
//// 0937 456 789 với 0937 456 387 thì ta so sánh 4 chữ cái đầu để xem có cùng nhà mạng không
//        String r1 = "TITV.vn";
//        String r2 = "TV.v";
//        boolean check = r1.regionMatches(2, r2, 0, 4);
//        System.out.println(check);
//        
//// hàm startWith => Hàm kiểm tra chuỗi bắt đầu bằng ....
//        String sdt =" 0973 234 343";
//        System.out.println("chuoi co bat dau bang 0973 khong: " + sdt.startsWith(" 0973"));
//        System.out.println("chuoi co bat dau bang 0974 khong: " + sdt.startsWith(" 0974"));
//
//// hàm endWith => Hàm kiểm tra chuỗi kết thúc bằng....
//        String tenFile1 = "lephamhoaibao.JPG";
//        String tenFile2 = "hocjava.PDF";
//        
//        if(tenFile1.endsWith(".JPG")){
//            System.out.println("file 1 là hình ảnh");
//        }else if(tenFile1.endsWith(".PDF")){
//            System.out.println("file 1 là file PDF");
//        }
//        
//        if(tenFile2.endsWith(".JPG")){
//            System.out.println("file 2 là hình ảnh");
//        }else if(tenFile2.endsWith(".PDF")){
//            System.out.println("file 2 là file PDF");
//        }
//// ứng dụng thực tế kiểm tra xem file của người dùng upload lên trang của chúng ta      
        
////P3 HÀM TÌM KIẾM CHUỖI TRONG JAVA
//    String s1 = "Xin chao co chu, xin chao cac ban, Xin chao!";
//    String s2 = "Xin chao";
//    String s3 = "Xin chao 123";
//    char c1 = 'o';
//    
//    // hàm indexOf
//    //cách 1
//        System.out.println(s1.indexOf(s2));// chuỗi s2 có tồn tại trong chuỗi s1 hay không
//        // => trả về vị trí tồn tại
//        System.out.println(s1.indexOf(s3));// trả về -1 có nghĩa là không tìm thấy s3 trong s1
//    // cách 2 sử dụng vị trí bắt đầu
//         System.out.println("vi tri cua s2 trong s1 la "+s1.indexOf(s2,2));
//    // cách 3 tìm kiếm kiểu char
//        System.out.println("vi tri cua c1 trong s1 la "+ s1.indexOf(c1));
//        System.out.println("vi tri cua c1 trong s1 la "+ s1.indexOf(c1,25));
//        
//    // hàm lastIndexOf
//    // là ngược lại của hàm indexOf là tìm kiếm từ phải sang trái
//    System.out.println("vi tri cua s2 trong s1 la "+s1.lastIndexOf(s2));
//    //cũng có 4 tình huống 
//    // trong thực tế ta có thể tìm kiếm tên file 

//// P4 CẮT, NỐI , THAY THẾ VÀ CHUYỂN ĐỔI CHUỖI
//        String s1 = "tItv";
//        String s2 = ".Vn";
//        
//        // hàm concat => nối chuỗi 
//        String s4 = s1.concat(s2); // 2 chuỗi được sử dụng không bị thay đổi giá trị
//        System.out.println(s4);
//        
//        // hàm replace => thay thế 
//        String s5 = " tung.vn";
//        String s6 = s5.replace("tung", "TITV");
//        System.out.println(s5.replace("tung", "tItv"));
//        System.out.println("s6 = "+s6); // thay thế nội dung bên trong chuỗi 
//        //nhưng không làm thay đổi giá trị của biến đó
//        
//        //hàm toLowerCase => hàm chuyển về viết thường
//        // hàm toUpperCase => hàm chuyển về viết hoa
//        System.out.println("toLowerCase của chuỗi s1 ta được "+ s1.toLowerCase());
//        System.out.println("toUpperCase của chuỗi s1 ta được " + s1.toUpperCase());
//               
//        // hàm trim => xóa khoảng trắng dư thừa ở đầu chuỗi
//        String s9 = " xin chào các bạn, mình là titv.vn ";
//        System.out.println(s9.trim());
//        
//        // hàm subString => cắt chuỗi con 
//        String s10 = "xin chào các bạn, mình là titv.vn";
//        String s11 = s10.substring(10); // cắt chuỗi từ vị trí thứ 10
//        System.out.println(s11);
//        String s12 = s10.substring(10, 15);
//        System.out.println(s12);
//        //=> copy chuỗi gốc ban đầu thành 1 chuỗi nhỏ hơn
    

////BÀI 53 MẢNG VÀ CÁCH COPY MẢNG
//// cách khai báo mảng
////c1 kdl  ten mang[] = new kdl[kích tướng mảng];
//        /* ten mang [0] = giá trị;// nếu là chuỗi thì thêm dấu ""
//           ten mang [1] = giá trị;
//           ......
//        */
////c2 kdl  ten mang[] = new kdl []{các giá trị của mảng};
////c3 kdl ten mang[] = {giá trị};
////=> 3 cách trên là giống nhau
//// SAO CHÉP MẢNG
//        int[] mang1 = {1, 2, 3};
//        
//        int[] mang1_a = mang1;// kiểu nguyên thủy nêu bị gán như thế thì sẽ bị thay đổi gtri
//        mang1_a[0] = 100;
//        
//        System.out.println("Mang 1: "+ Arrays.toString(mang1));
//        System.out.println("Mang 1_a "+ Arrays.toString(mang1_a));
//        
//        //copy bảng hàm clone
//        int[] mang1_b = mang1.clone();// hàm này không làm thay đổi giá trị của mảng bị gán
//        mang1_b[0] = 50;
//        System.out.println("Mang 1_b "+Arrays.toString(mang1_b));
//        
//        //copy bảng hàm System.arraycoppy
//        int[] mang1_c = new int[mang1.length];
//        System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
//        mang1_c[0] = 60;
//        System.out.println("Mang 1_c "+Arrays.toString(mang1_c));
//        
//        //kiểu dữ liệu đối tượng
//        String[] mang_doi_tuong = {"titv",".vn"};
//        
//        String[] mang_doi_tuong1 = mang_doi_tuong;
//        mang_doi_tuong1[0] = "bao";
//        System.out.println("mang doi tuong "+Arrays.toString(mang_doi_tuong));
//        System.out.println("mang doi tuong 1 "+Arrays.toString(mang_doi_tuong1));
//        String[] mang_doi_tuong2 = mang_doi_tuong.clone();
//        mang_doi_tuong2[0] = "TITV";
//        System.out.println("mang doi tuong 2 "+Arrays.toString(mang_doi_tuong2));
//        String[] mang_doi_tuong3 = new String [mang_doi_tuong.length];
//        System.arraycopy(mang_doi_tuong3, 0, mang_doi_tuong, 0, mang_doi_tuong.length);
//        System.out.println("mang doi tuong 3 "+ Arrays.toString(mang_doi_tuong3));
    

////BÀI 54 XÂY DỰNG PHƯƠNG THỨC COMPARETO VÀ HIỂU RÕ COMPARABLE TRONG JAVA
//        bai54_SinhVien sv1 = new bai54_SinhVien(150, " Tran Van Thanh", "Lop1", 9);
//        bai54_SinhVien sv2 = new bai54_SinhVien(100, " Nguyen Thi Thanh Hoa", "Lop2", 8);
//        bai54_SinhVien sv3 = new bai54_SinhVien(199, " Nguyen Van An", "Lop2", 8);
//        
//        System.out.println(sv1.compareTo(sv2));
//        System.out.println(sv3.compareTo(sv1));
//        System.out.println(sv2.compareTo(sv3));



////BÀI 55 TÌM KIẾM SẮP XẾP VÀ COPY MẢNG BẰNG HÀM CÓ SẴN TRONG JAVA
//        int[] a = new int[]{1, 8, 2, 6, 4, 3, 7, 9};
//        int[] b = new int[15];
//
//        System.out.println("mang a " + Arrays.toString(a));
//        // hàm sắp xếp (tăng dần)
//        Arrays.sort(a);
//        System.out.println("mang a sau khi sắp xếp: " + Arrays.toString(a));
//        
//        int[]c = new int [a.length];
//        int index = 0;
//        for (int i = a.length-1; i >=0; i--) {
//            c[index] = a[i];
//            index ++;
//        }
//        System.out.println("mang c "+Arrays.toString(c));
//        a.equals(c);
//        System.out.println("mang a "+ Arrays.toString(a));
//        //hàm tìm kiếm binarysearch
//        System.out.println(Arrays.binarySearch(a, 4));// chỉ sắp xếp cho mảng tăng dần
//        System.out.println(Arrays.binarySearch(a, -1));
//
//
//        // hàm điền giá trị 
//        Arrays.fill(b, 5);
//        System.out.println("mang b " + Arrays.toString(b));



//// BÀI 56 PHÂN TÁCH CHUỖI THÀNH MẢNG
//        String s ="xin chào các bạn, tui là Peter!";
//        
//        String []a = s.split(" ");
//        System.out.println(Arrays.toString(a));
//        String []b= s.split(",");
//        System.out.println(Arrays.toString(b));
//        
//        String s2 = " xin chào, mình là Peter. Mình là lập trình viên!";
//        String[] c = s2.split("\\.|\\,"); // lấy dấu . và dấu , là những phần từ ngăn cách
//        System.out.println(Arrays.toString(c));


//BÀI 57 bài tập 


////BÀI 58 CÁC LỚP QUẢN LÝ THỜI GIAN VÀ NGÀY THÁNG TRONG JAVA
//
//        // hàm lấy thời gian hiện tại
//        long t1 = System.currentTimeMillis();
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Test");
//        }
//        long t2 = System.currentTimeMillis();
//
//        System.out.println("Trước khi chạy for " + t1);
//        System.out.println("Sau khi chạy for " + t2);
//        System.out.println("thời gian " + ((t2 - t1)) + "mls");
//        System.out.println("thời gian " + ((t2 - t1) / 1000) + "s");
//        
//        //TimeUnit
//        System.out.println("3000 năm = "+TimeUnit.DAYS.toSeconds(3000*365)+"s");
//        System.out.println("1 giờ = "+ TimeUnit.HOURS.toSeconds(1)+"s");
//        
//        //Date
//        Date d = new Date(System.currentTimeMillis());
//        System.out.println(d.getDate()+"/" + (d.getMonth()+1) + "/"+ (d.getYear()+1900));
//        
//        //Calendar
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.DATE)+"-" + (c.get(Calendar.MONTH)+1)+"-"+ c.get(Calendar.YEAR));
//
//        c.add(Calendar.DATE, 16);
//        System.out.println(c.get(Calendar.DATE)+"-" + (c.get(Calendar.MONTH)+1)+"-"+ c.get(Calendar.YEAR));



////BÀI 59 KIỂU DỮ LIỆU ĐẶC BIỆT ENUM TRONG JAVA
//        bai59_TKB tkb_t2 = new bai59_TKB(bai59_day.Monday, "Toán Lý Hóa");
//        bai59_TKB tkb_t3 = new  bai59_TKB(bai59_day.Tuesday, "Văn Sử Địa");
//        bai59_TKB tkb_t4 = new  bai59_TKB(bai59_day.Wednesday, "Lý Hóa Sinh");
//        bai59_TKB tkb_t5 = new  bai59_TKB(bai59_day.Thursday, "Tin GDCD Thể dục");
//
//        System.out.println(tkb_t5);
//
//        // Enum được xem là 1 class chứa những kiểu dữ liệu cùng loại và cố định
//
//        int x = bai59_Thang.thang1.soNgay();
//        System.out.println("tháng 1 có "+x +"ngày");


//BÀI 60 COLLECTION



















        
    }
    
 
}

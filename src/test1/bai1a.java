package test1;

import java.util.Scanner;

public class bai1a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// Nhập giá trị các phần tử mảng
        System.out.println("nhập giá trị khởi tạo mảng");
        int  n = Integer.parseInt(scanner.nextLine());
        int [] array = new int [n];
        System.out.println();
        do {
            System.out.println("******************MANU**************************");
            System.out.println("Nhập giá trị các phần tử mảng ");
            System.out.println("Hiển thị giá trị các phần tử mảng");
            System.out.println("In giá trị các phần tử là số nguyên tố trong mảng");
            System.out.println("In giá trị max, min các phần tử trong mảng");
            System.out.println("Sắp xếp mảng giảm dần");
            System.out.println("Thoát");
            System.out.println("sự lụa chọn của bạn ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:

                // nhap cac gia tri cua phan tu;
                    System.out.println("nhap gia tri cac phan tu cua mang");
                    for (int i = 0; i < array.length; i++) {
                        System.out.printf("array[%d]=", i);
                        array[i]=Integer.parseInt(scanner.nextLine());
                        break;
                    }


                case  2:
                    // Hiển thị giá trị các phần tử mảng;
                    for (int j = 0; j < array.length; j++) {
                        System.out.printf("  cac phan tu cua mang la %d",array[j]);
                        break;
                    }





                case 3:
                    //In giá trị các phần tử là số nguyên tố trong mảng

                    boolean check;
                    if (n>=2){
                        System.out.printf("cac so nguyen to tu n den %d\n ", n );
                        for (int i = 2; i < n; i++) {
                            check = false;
                            for (int j = 2; j < Math.sqrt(i); j++) {
                                if (i%j==0){
                                    check = true;
                                    break;
                                }
                                if (!check){
                                    System.out.println("so nguyen to trong mang la %d"+ i);
                            }

                            }


                        }


                    }



                case 4:

                case 5:

                case 6:

                default:
                    System.out.printf(" vui long chon tu mot den 4");
            }

        }while(true);


    }
}

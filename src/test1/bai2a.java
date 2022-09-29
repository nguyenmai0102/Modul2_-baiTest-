package test1;

import java.util.Scanner;

public class bai2a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào dòng của ma trận");
        int n = scanner.nextInt();
        System.out.println("nhập vào cột của ma trận");
        int m = scanner.nextInt();
        int[][] go = new int[n][m];
        do {
            System.out.println("****MANU*************");
            System.out.println("Nhập giá trị các phần tử của mảng ");
            System.out.println("In giá trị các phần tử của mảng theo ma trận");

            System.out.println(". In giá trị các phần tử nằm trên chéo chính, chéo phụ và tính tổng");

            System.out.println("Sắp xếp mảng tăng dần theo cột [");
            System.out.println("Thoát");
            System.out.println("sự lụa chọn của bạn ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    // nhap gia tri cac phan tu trong mang

                    System.out.println("nhập các phần tử trong ma trận");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.println("go[" + i + "][" + j + "]= ");
                            go[i][j] = scanner.nextInt();
                            break;
                        }
                    }

                case 2:
// in cac gia tri phan tu trong mang;
                    n = Integer.parseInt(scanner.nextLine());
                    m = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("%d\t", go[i][j]);
                            break;
                        }
                    }

                case 3:
                    // In giá trị các phần tử nằm trên chéo chính va tinh tong
                    int total = 0;

                    n = Integer.parseInt(scanner.nextLine());
                    m = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == j) {
                                total = total + go[i][j];
                            }


                        }
                        ;
                    }

            }

        }while (true) ;

    }
}





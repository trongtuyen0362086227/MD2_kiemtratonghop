import java.util.Scanner;

public class baitonghop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cot = 0;
        int hang = 0;
        int sum = 0;
        int[][] arr = {{0, 0}};
        do {
            System.out.println("*****************MENU***************");
            System.out.println("1. Nhap gia tri cac phan tu cua mang");
            System.out.println("2. Hien thi phan tu cua mang theo ma tran");
            System.out.println("3. In gia tri cac phan tu cua mang theo duong bien");
            System.out.println("4. In gia tri cac phan tu tren cheo chinh cheo phu va tinh tong");
            System.out.println("5. tim gia tri min max trong mang");
            System.out.println("6. sap xep tang dan theo cot");
            System.out.println("7. thoat");
            System.out.print("Su lua chon cua ban: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhap so hang");
                    hang = scanner.nextInt();
                    System.out.println("nhap so cot");
                    cot = scanner.nextInt();
                    arr = new int[hang][cot];
                    System.out.println("nhap cac phan tu cua mang");
                    for (int i = 0; i < hang; i++) {
                        for (int j = 0; j < cot; j++) {
                            System.out.printf("nhap phan tu [%d][%d] vao\n", i, j);
                            arr[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("cac phan tu cua mang la: ");
                    for (int i = 0; i < hang; i++) {
                        for (int j = 0; j < cot; j++) {
                            System.out.printf("%d\t", arr[i][j]);
                        }
                        System.out.println("\n");
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    if (cot == hang) {
                        int tongcheochinh = 0;
                        System.out.println("cac phan tu duong cheo chinh: ");
                        for (int i = 0; i < hang; i++) {
                            for (int j = 0; j < cot; j++) {
                                if (i == j) {
                                    tongcheochinh += arr[i][j];
                                    System.out.printf("%d\t", arr[i][j]);
                                }
                            }
                        }
                        System.out.println();
                        System.out.printf("tong cac phan tu duong cheo chinh la : %d\n", tongcheochinh);
                        System.out.println("cac phan tu duong cheo phu: ");
                        int tongcheophu = 0;
                        for (int i = 0; i < hang; i++) {
                            for (int j = 0; j < cot; j++) {
                                if (i + j == hang - 1) {
                                    tongcheophu += arr[i][j];
                                    System.out.printf("%d\t", arr[i][j]);
                                }
                            }
                        }
                        System.out.println();
                        System.out.printf("tong cac phan tu duong cheo phu la : %d\n", tongcheophu);
                    } else {
                        System.err.println("vui long nhap so cot va so hang bang nhau de tao ma tran vuong\n moi ban quay lai buoc 1");
                    }
                    break;
                case 4:
                    System.out.println("cac phan tu cua mang truoc khi sap xep: ");
                    for (int i = 0; i < hang; i++) {
                        for (int j = 0; j < cot; j++) {
                            System.out.printf("%d\t", arr[i][j]);
                        }
                        System.out.println("\n");
                    }
                    System.out.println("\n");
                    System.out.println("mang sau khi sap xep giam dan theo cot la: ");
                    for (int i = 0; i < hang; i++) {
                        for (int j = 0; j < cot; j++) {
                            for (int k = 0; k < cot; k++) {
                                if (arr[i][k] < arr[j][k]) {
                                    int item = arr[i][k];
                                    arr[i][k] = arr[j][k];
                                    arr[j][k] = item;
                                }
                            }
                        }
                    }
                    for (int i = 0; i < hang; i++) {
                        for (int j = 0; j < cot; j++) {
                            System.out.printf("%d\t", arr[i][j]);
                        }
                        System.out.println("\n");
                    }
                    System.out.println("\n");
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}


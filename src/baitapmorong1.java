import java.util.Scanner;

public class baitapmorong1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrlenght = 0;
        int sum = 0;
        int[] arr = {0};
        do {
            System.out.println("*****************MENU***************");
            System.out.println("1. Nhap gia tri cac phan tu cua mang");
            System.out.println("2. Hien thi phan tu cua mang");
            System.out.println("3. In gia tri cac phan tu la so nguyen to trong mang");
            System.out.println("4. In gia tri Min, Max cua mang");
            System.out.println("5. sap xep mang giam dan");
            System.out.println("6. thoat");
            System.out.print("Su lua chon cua ban: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhap chieu dai cua mang");
                    arrlenght = scanner.nextInt();
                    arr = new int[arrlenght];
                    System.out.println("nhap cac phan tu cua mang");
                    for (int i = 0; i < arrlenght; i++) {
                        System.out.printf("nhap phan tu %d vao\n",i);
                        arr[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("cac phan tu cua mang la: ");
                    for (int i = 0; i < arrlenght; i++) {
                        System.out.printf("%d\t", arr[i]);
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("cac so nguyen to trong mang la: ");
                    for (int i = 0; i < arrlenght; i++) {
                        if (arr[i] >= 2) {
                            boolean check = false;
                            for (int j = 2; j < arr[i]; j++) {
                                if (arr[i] % j == 0) {
                                    check = true;
                                }
                            }
                            if (!check) {
                                System.out.printf("%d\t", arr[i]);
                            }

                        }
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    int min = arr[0];
                    for (int i = 1; i < arrlenght; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.printf("phan tu nho nhat cua mang la %d\n", min);
                    int max = arr[0];
                    for (int i = 1; i < arrlenght; i++) {
                        if (arr[i] > min) {
                            max = arr[i];
                        }
                    }
                    System.out.printf("phan tu lon nhat cua mang la %d\n", max);
                    break;
                case 5:
                    System.out.println("mang sau khi sap xep giam dan");
                    for (int i = 0; i < arrlenght ; i++) {
                        for (int j =i+1; j < arrlenght; j++) {
                            if (arr[i] < arr[j]) {
                                int c = arr[i];
                                arr[i] = arr[j];
                                arr[j] = c;
                            }
                        }
                        System.out.printf("%d\t", arr[i]);
                    }
                    System.out.println("\n");
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
        while (true);

    }
}

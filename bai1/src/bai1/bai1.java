package bai1;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài của mảng
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Khởi tạo giá trị lớn nhất và nhỏ nhất
        int max = arr[0];
        int min = arr[0];

        // Tìm phần tử lớn nhất và nhỏ nhất
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // In ra kết quả
        System.out.println("Phan tu lon nhat: " + max);
        System.out.println("Phan tu nho nhat: " + min);

        scanner.close();
    }
}

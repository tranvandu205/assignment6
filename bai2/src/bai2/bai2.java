package bai2;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài của mảng
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Nhập các phần tử của mảng và tính tổng
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        // Tính trung bình cộng
        double average = (double) sum / n;

        System.out.println("Tong cac phan tu: " + sum);
        System.out.println("Trung binh cong: " + average);

        scanner.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

import java.util.Scanner;

public class Bai3 {

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

        // Nhập phần tử cần đếm
        System.out.print("Nhap so nguyen can dem: ");
        int x = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua " + x + " trong mang la: " + count);

        scanner.close();
    }
}

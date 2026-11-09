package org.example.stage01;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        double score;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập điểm số (0-100): ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Dữ liệu nhập vào không phải là số hợp lệ.");
                scanner.next();
                continue;
            }
            score = scanner.nextDouble();
            if (score < 0 || score > 100) {
                System.out.println("Điểm số không hợp lệ. Vui lòng nhập lại.");
                continue;
            }
            break;
        }

        String grade;
        if (score > 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Điểm số hợp lệ: " + score + " - Xếp loại: " + grade);
        scanner.close();
    }
}

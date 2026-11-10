package org.example.stage02;

import java.math.BigDecimal;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lương theo giờ: ");
        BigDecimal hourly = new BigDecimal(scanner.nextLine());

        System.out.print("Nhập số giờ làm trong tháng: ");
        Integer hours = Integer.valueOf(scanner.nextLine());

        System.out.println("Lương tháng: " + SalaryCalculator.calculateMonthlySalary(hourly, hours));
    }
}

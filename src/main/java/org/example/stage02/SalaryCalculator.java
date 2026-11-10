package org.example.stage02;

import java.math.BigDecimal;

public class SalaryCalculator {
    public static BigDecimal calculateMonthlySalary(BigDecimal hourlySalary, Integer monthlyWorkHours) {
        if (hourlySalary == null) {
            throw new IllegalArgumentException("Lương theo giờ không được null");
        }
        if (monthlyWorkHours == null) {
            throw new IllegalArgumentException("Số giờ làm việc không được null");
        }
        if (hourlySalary.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Lương theo giờ không được âm");
        }
        if (monthlyWorkHours < 0) {
            throw new IllegalArgumentException("Số giờ làm việc không được âm");
        }

        return hourlySalary.multiply(BigDecimal.valueOf(monthlyWorkHours));
    }
}

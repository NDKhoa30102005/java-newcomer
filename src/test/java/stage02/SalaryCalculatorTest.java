package stage02;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

import org.example.stage02.SalaryCalculator;
import org.junit.jupiter.api.Test;

public class SalaryCalculatorTest {
    @Test
    void normalSalary() {
        BigDecimal hourly = new BigDecimal("25.50");
        Integer hours = 160;
        BigDecimal result = SalaryCalculator.calculateMonthlySalary(hourly, hours);
        assertEquals(new BigDecimal("4080.00"), result);
    }

    @Test
    void zeroHourlySalary() {
        BigDecimal result = SalaryCalculator.calculateMonthlySalary(new BigDecimal("0"), 160);
        assertEquals(0, result.compareTo(BigDecimal.ZERO));
    }

    @Test
    void zeroWorkHours() {
        BigDecimal result = SalaryCalculator.calculateMonthlySalary(new BigDecimal("25.50"), 0);
        assertEquals(0, result.compareTo(BigDecimal.ZERO));
    }

    @Test
    void nullHourlySalary() {
        assertThrows(IllegalArgumentException.class,
                () -> SalaryCalculator.calculateMonthlySalary(null, 160));
    }

    @Test
    void nullWorkHours() {
        assertThrows(IllegalArgumentException.class,
                () -> SalaryCalculator.calculateMonthlySalary(new BigDecimal("25.50"), null));
    }

    @Test
    void negativeHourlySalary() {
        assertThrows(IllegalArgumentException.class,
                () -> SalaryCalculator.calculateMonthlySalary(new BigDecimal("-1.00"), 160));
    }

    @Test
    void negativeWorkHours() {
        assertThrows(IllegalArgumentException.class,
                () -> SalaryCalculator.calculateMonthlySalary(new BigDecimal("25.50"), -1));
    }

    @Test
    void regression_shouldMultiplyByFullWorkHours() {
        BigDecimal result = SalaryCalculator.calculateMonthlySalary(new BigDecimal("10.00"), 100);
        assertEquals(new BigDecimal("1000.00"), result);
    }
}

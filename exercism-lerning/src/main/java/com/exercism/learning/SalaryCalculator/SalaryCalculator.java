package com.exercism.learning.SalaryCalculator;

public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * (double) this.bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        final double BASE_SALARY = 1000.00;
        final double SALARY_LIMIT = 2000.00;
        double finalSalary = (BASE_SALARY * this.salaryMultiplier(daysSkipped))
                + this.bonusForProductsSold(productsSold);
        return finalSalary > SALARY_LIMIT ? SALARY_LIMIT : finalSalary;
    }
}

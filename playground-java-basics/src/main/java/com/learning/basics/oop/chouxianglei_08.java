package com.learning.basics.oop;

public class chouxianglei_08 {
    public static void main(String[] args) {
        Income1[] incomes = new Income1[]{
                new SalaryIncome(5000),
                new RoyaltyIncome(8000)
        };
        System.out.println(totalTax(incomes));

    }

    public static double totalTax(Income1... incomes) {
        double sum = 0.0;
        for (Income1 income : incomes) {
            sum += income.getTax();
        }
        return sum;
    }
}

abstract class Income1{
     double income;

    public Income1(double income) {
        this.income = income;
    }

    public abstract double getTax();
}

class SalaryIncome extends Income1{

    public SalaryIncome(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000){
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class RoyaltyIncome extends Income1{
    public RoyaltyIncome(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        double taxable; // 应纳税所得额
        if (income <= 800) {
            return 0;
        }
        else if (income <= 4000) {
            taxable = income - 800;
        }
        else {
            taxable = income * 0.8;
        }
        // 实际税率 14%
        return taxable * 0.14;
    }
}



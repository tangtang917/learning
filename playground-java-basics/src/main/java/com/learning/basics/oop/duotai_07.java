package com.learning.basics.oop;

public class duotai_07 {

    public static void main(String[] args) {
        Income[] incomes = new Income[]{
                new Salary(7000),
                new Gaofei(2500)
        };

        System.out.println(getTax(incomes));
    }

    public static double getTax(Income... incomes) {
        double total = 0;
        for (Income income : incomes) {
            total += income.getIncome();
        }
        return total;
    }
}

class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getIncome() {
        return income;
    }
}

class Salary extends Income {

    public Salary(double income) {
        super(income);
    }

    @Override
    public double getIncome() {
        if (income <= 5000) {
            return 0;
        }
        return income * 0.1;
    }
}

class Gaofei extends Income {

    public Gaofei(double income) {
        super(income);
    }

    @Override
    public double getIncome() {
        if (income <= 3000) {
            return 0;
        }
        return income * 0.2;
    }
}

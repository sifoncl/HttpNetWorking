package by.nikolay;

import java.util.Arrays;

public class Employees {
    private String info;

    private Employear[] employees;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Employear[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employear[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "info='" + info + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }

    public int totalIncome() {
        return Arrays.stream(this.employees).map(x -> x.getSalary()).mapToInt(Integer::intValue)
                .sum();
    }

    public int totalTax() {
        return Arrays.stream(this.employees).map(x -> x.getTax()).mapToInt(Integer::intValue)
                .sum();
    }

    public int totalProfit() {
        return this.totalIncome() - this.totalTax();
    }


}

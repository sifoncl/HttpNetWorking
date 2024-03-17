package by.nikolay;

public class Employear {
    private  int id;
    private  String name;
    private  int salary;

    private  int tax;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Employear{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", tax=" + tax +
                '}';
    }


}
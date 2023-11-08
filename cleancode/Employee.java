package cleancode;

abstract class EmployeeType {
    abstract int payAmount(EmployeeType emp);

    public int getMonthlySalary() {
        return 0;
    }
    public int getCommission() {
        return 0;
    }
    public int getBonus() {
        return 0;
    }
}
class Salesman {
    int payAmount(EmployeeType emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }
}
class Manager {
    int payAmount(EmployeeType emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }
}
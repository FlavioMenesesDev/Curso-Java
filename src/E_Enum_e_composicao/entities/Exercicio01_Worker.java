package E_Enum_e_composicao.entities;

import E_Enum_e_composicao.entities.enums.Exercicio01_WorkLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exercicio01_Worker {
    private String name;
    private Exercicio01_WorkLevel level;
    private Double baseSalary;

    private Exercicio01_Department department;
    private List<Exercicio01_HourContract> contracts = new ArrayList<>();


    public Exercicio01_Worker() {
    }

    public Exercicio01_Worker(String name, Exercicio01_WorkLevel level, Double baseSalary, Exercicio01_Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Exercicio01_WorkLevel getLevel() {
        return level;
    }

    public void setLevel(Exercicio01_WorkLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Exercicio01_Department getDepartment() {
        return department;
    }

    public void setDepartment(Exercicio01_Department department) {
        this.department = department;
    }

    public List<Exercicio01_HourContract> getContracts() {
        return contracts;
    }

    public void addContract(Exercicio01_HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(Exercicio01_HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;

        for (Exercicio01_HourContract c : contracts) {
            LocalDate c2 = c.getDate();
            if (c2.getYear() == year && c2.getMonthValue() == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

}

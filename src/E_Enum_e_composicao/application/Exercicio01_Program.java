package E_Enum_e_composicao.application;

import E_Enum_e_composicao.entities.Exercicio01_Department;
import E_Enum_e_composicao.entities.Exercicio01_HourContract;
import E_Enum_e_composicao.entities.Exercicio01_Worker;
import E_Enum_e_composicao.entities.enums.Exercicio01_WorkLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio01_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.printf("Department: ");
        String departmentName = sc.nextLine();

        System.out.println("Data Worker:");
        System.out.printf("Name: ");
        String name = sc.nextLine();
        System.out.printf("Level: ");
        String level = sc.nextLine();
        System.out.printf("Base Salary: ");
        double baseSalary = sc.nextDouble();
        
        Exercicio01_Worker worker = new Exercicio01_Worker(name, Exercicio01_WorkLevel.valueOf(level), baseSalary, new Exercicio01_Department(departmentName));

        System.out.println();
        System.out.printf("Contracts: ");
        int Numbercontracts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < Numbercontracts; i++) {
            System.out.println("Enter Contract #"+i+1+" data:");
            System.out.printf("Date (DD/MM/YYYY): ");
            String dateTemp = sc.nextLine();
            LocalDate contractDate = LocalDate.parse(dateTemp, format01);
            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration: ");
            int hour = sc.nextInt();
            sc.nextLine();

            System.out.println("DEBUG: Date = " + contractDate +
                    ", Value = " + valuePerHour +
                    ", Hours = " + hour);

            Exercicio01_HourContract contract = new Exercicio01_HourContract(contractDate, valuePerHour, hour);
            worker.addContract(contract);

            System.out.println("DEBUG: Contract date from getDate() = " + contract.getDate());
        }

        System.out.println();
        System.out.print("Enter Month and Year to Calculate Income (MM/YYYY): ");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        double salary = worker.income(year, month);

        System.out.println("Name: "+worker.getName());
        System.out.println("Department:"+worker.getDepartment().getName());
        System.out.println("Income of "+monthAndYear+": "+String.format("%.2f", salary));

        sc.close();
    }

}

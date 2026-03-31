package F_List.Application;

import F_List.Entities.Employee01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Funcionarios: ");
        int n = sc.nextInt();

        List <Employee01> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee "+(i+1)+":");
            System.out.printf("Id: ");
            Integer id = sc.nextInt();

            while (hasId(list , id)){
                System.out.println("Id Existente, tente novamente!");
                id = sc.nextInt();
            }

            System.out.printf("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Employee01(id, name, salary));
        }

        System.out.println();
        System.out.printf("Id: ");
        int idSalary = sc.nextInt();

        // ACHAR ID:
        //Solução 1
        Employee01 emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        //Solução 2
        //Integer pos = position(list, idSalary);

        if (emp == null){
            System.out.println("Id Invalido");
        }else{
            System.out.print("Porcentagem: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List Employee:");
        for (Employee01 name : list){
            System.out.println(name);
        }

    }

    public static Integer position(List<Employee01> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId (List <Employee01> list , int id){
        Employee01 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}

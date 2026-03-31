package K_Interfaces.Model.Application;

import K_Interfaces.Model.Entities.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato");
        System.out.printf("Numero: ");
        int number = sc.nextInt();
        System.out.printf("Data (dd/MM/yyyy): ");
        sc.nextLine();
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.printf("Valor do contrato: ");
        double valueTotal = sc.nextDouble();
        System.out.printf("Numero dos Parcelas: ");
        int installment = sc.nextInt();

        Contract contract = new Contract(number, date, valueTotal);

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, installment);

        System.out.println( );
        System.out.println("PARCELAS:");
        for (Installment i : contract.getInstallments()){
            System.out.println(i);
        }

        sc.close();
    }
}

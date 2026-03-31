package K_Interfaces.Model.Entities;

import K_Interfaces.Model.Services.OnlinePaymentService;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract (Contract contract, Integer months){
        double amount = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate date = contract.getDate().plusMonths(i);
            amount = onlinePaymentService.interest(amount, i);
            amount = amount + onlinePaymentService.paymentFee(amount);

            contract.getInstallments().add(new Installment(date, amount));
            amount = contract.getTotalValue() / months;
        }

    }
}

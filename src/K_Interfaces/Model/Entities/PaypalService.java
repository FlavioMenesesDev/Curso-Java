package K_Interfaces.Model.Entities;

import K_Interfaces.Model.Services.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {

    @Override
    public Double paymentFee(Double amount) {
        return (amount * 0.02);
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return  amount + (amount * 0.01) * months;
    }
}
